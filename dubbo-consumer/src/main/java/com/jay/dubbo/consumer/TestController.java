package com.jay.dubbo.consumer;

import com.alibaba.fastjson.JSON;
import com.jay.dubbo.provider.api.model.LogReq;
import com.jay.dubbo.provider.api.model.UserTo;
import com.jay.dubbo.provider.api.service.LogApi;
import com.jay.dubbo.provider.api.service.UserApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description
 * Created by caoyj on 2018/10/10.
 */

@RestController
public class TestController {

    @Reference
    private LogApi logService;
    @Reference
    private UserApi userService;

    @RequestMapping("/test.json")
    public String test1(){
        LogReq logReq = new LogReq();
        logReq.setContent("cyj");
       long id = logService.create(logReq);
       return id+"";
    }



    @RequestMapping("/getuser.json")
    public String getuser(){
        List<UserTo> userTo = userService.getUser();
        return JSON.toJSONString( userTo);
    }

    @RequestMapping("/getuser1.json")
    public String getuser1(){
        UserTo userTo = userService.getUser1();
        return JSON.toJSONString( userTo);
    }
}
