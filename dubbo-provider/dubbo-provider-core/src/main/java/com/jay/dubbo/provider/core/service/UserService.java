package com.jay.dubbo.provider.core.service;


import com.jay.dubbo.provider.core.dto.UserDto;

import java.util.List;


public interface UserService {

    /**
     * 获取用户
     * @return
     */
    List<UserDto> getUser();

    /**
     * 自定义解析器
     * @return
     */
    UserDto getUser1();
}
