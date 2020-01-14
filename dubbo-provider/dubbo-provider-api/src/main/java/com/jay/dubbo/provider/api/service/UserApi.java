package com.jay.dubbo.provider.api.service;


import com.jay.dubbo.provider.api.model.UserTo;

import java.util.List;

public interface UserApi {

    /**
     * 获取用户
     * @return
     */
    List<UserTo> getUser();


    /**
     * 获取用户
     * @return
     */
    List<UserTo> getUser1();

}
