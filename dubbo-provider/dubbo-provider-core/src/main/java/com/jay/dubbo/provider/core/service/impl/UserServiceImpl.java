package com.jay.dubbo.provider.core.service.impl;


import com.github.jay.merge.annonation.MergeResult;
import com.github.jay.merge.facade.DefaultMergeResultParser;
import com.google.common.collect.Lists;
import com.jay.dubbo.provider.core.dto.UserDto;
import com.jay.dubbo.provider.core.mergeresultparser.UserMergeResultParser;
import com.jay.dubbo.provider.core.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserServiceImpl implements UserService {

    private Integer i = 0;

    @Override
    @MergeResult(resultParser = DefaultMergeResultParser.class)
    public List<UserDto> getUser(){
        List<UserDto> result = Lists.newArrayList();
        UserDto userDto = new UserDto();
        userDto.setName("cyj");
        userDto.setAge(33);
        userDto.setCityCode("1000");
        userDto.setSex("M");
        userDto.setVersion(i++);


        UserDto userDto1 = new UserDto();
        userDto1.setName("yxq");
        userDto1.setAge(32);
        userDto1.setCityCode("1001");
        userDto1.setSex("FM");
        userDto1.setVersion(i++);

        result.add(userDto);
        result.add(userDto1);
        return result;
    }



    @Override
    @MergeResult(resultParser = UserMergeResultParser.class)
    public UserDto getUser1(){
        UserDto userDto = new UserDto();
        userDto.setName("cyj");
        userDto.setAge(33);
        userDto.setCityCode("1000");
        userDto.setSex("M");
        userDto.setVersion(i++);

        return userDto;
    }

}
