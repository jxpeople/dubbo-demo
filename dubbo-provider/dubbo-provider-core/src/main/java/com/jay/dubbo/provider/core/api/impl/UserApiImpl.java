package com.jay.dubbo.provider.core.api.impl;


import com.jay.dubbo.provider.api.model.UserTo;
import com.jay.dubbo.provider.api.service.UserApi;
import com.jay.dubbo.provider.core.dto.UserDto;
import com.jay.dubbo.provider.core.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Service(interfaceClass = UserApi.class)
@Component
public class UserApiImpl implements UserApi {

    private Integer i = 0;
    @Autowired
    private UserService userService;

    @Override
    public List<UserTo> getUser(){
        return UserDto.convert2ToList(userService.getUser());
    }

    @Override
    public List<UserTo> getUser1(){
        return UserDto.convert2ToList(userService.getUser1());
    }
}
