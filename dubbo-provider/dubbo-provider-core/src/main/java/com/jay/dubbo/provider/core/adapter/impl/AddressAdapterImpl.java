package com.jay.dubbo.provider.core.adapter.impl;

import com.google.common.collect.Maps;
import com.jay.dubbo.provider.core.adapter.AddressAdapter;
import com.jay.dubbo.provider.core.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author caoyj
 * @since 2020/1/14 下午3:33
 */
@Service
public class AddressAdapterImpl implements AddressAdapter{


    @Override
    public AddressDto getAddress(String cittyCode) {

        AddressDto addressDto = new AddressDto();
        addressDto.setAddress("杭州");
        addressDto.setCityCode("1000");

        return addressDto;
    }


    @Override
    public Map<String,AddressDto> getAddressByCode(List<String> cityCodeList) {

        Map<String,AddressDto> result = Maps.newHashMap();

        for(String cityCode : cityCodeList) {
            AddressDto addressDto = new AddressDto();
            addressDto.setAddress("杭州"+cityCode);
            addressDto.setCityCode(cityCode);

            int age = Integer.valueOf(cityCode);
            addressDto.setAge(age);
            addressDto.setAgeStr(age+"老了");

            result.put(cityCode, addressDto);
        }
        return result;
    }
}
