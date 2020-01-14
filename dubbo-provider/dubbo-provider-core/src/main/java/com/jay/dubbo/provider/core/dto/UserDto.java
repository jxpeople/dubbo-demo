package com.jay.dubbo.provider.core.dto;

import com.github.jay.merge.annonation.MergeField;
import com.jay.dubbo.provider.api.model.UserTo;
import com.jay.dubbo.provider.core.adapter.AddressAdapter;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author caoyj
 * @since 2020/1/14 下午3:28
 */
@Data
public class UserDto {

    private String name;
    // 需要聚合的属性
    private String sex;
    // 需要聚合的属性
    @MergeField(feign = AddressAdapter.class,key = "cityCode",target = "address",method = "getAddressByCode",methodType = List.class,isValueNeedMerge = true,targetClass = AddressDto.class)
    private String cityCode;
    private String address;

    @MergeField(feign = AddressAdapter.class,key = "age",target = "ageStr",method = "getAddressByCode",methodType = List.class,targetClass = AddressDto.class)
    private Integer age;
    private String ageStr;

    private Integer version;


    public static List<UserTo> convert2ToList(List<UserDto> userDtoList) {
        if (CollectionUtils.isEmpty(userDtoList)) {
            return Collections.emptyList();
        }
        return userDtoList.stream().map(UserDto::convert2To).collect(Collectors.toList());
    }

    public static UserTo convert2To(UserDto userDto) {
        if (userDto == null) {
            return null;
        }
        UserTo userTo = new UserTo();
        userTo.setName(userDto.getName());
        userTo.setSex(userDto.getSex());
        userTo.setCityCode(userDto.getCityCode());
        userTo.setAddress(userDto.getAddress());
        userTo.setAge(userDto.getAge());
        userTo.setAgeStr(userDto.getAgeStr());
        userTo.setVersion(userDto.getVersion());
        return userTo;
    }

}
