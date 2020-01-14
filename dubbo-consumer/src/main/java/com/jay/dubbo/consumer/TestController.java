package com.jay.dubbo.consumer;

import com.jay.dubbo.provider.api.model.LogReq;
import com.jay.dubbo.provider.api.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Created by caoyj on 2018/10/10.
 */

@RestController
public class TestController {

    @Autowired
    private LogService logService;

    @RequestMapping("/test.json")
    public String test1(){
        LogReq logReq = new LogReq();
        logReq.setContent("cyj");
       long id = logService.create(logReq);
       return id+"";
    }

}
