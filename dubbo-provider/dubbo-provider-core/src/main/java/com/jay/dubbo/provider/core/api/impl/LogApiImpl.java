package com.jay.dubbo.provider.core.api.impl;


import com.jay.dubbo.provider.api.model.LogReq;
import com.jay.dubbo.provider.api.service.LogApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LogApi.class)
@Component
public class LogApiImpl implements LogApi {

    private long i = 0L;

    @Override
    public Long create(LogReq logReq) {
        return i++;
    }

}
