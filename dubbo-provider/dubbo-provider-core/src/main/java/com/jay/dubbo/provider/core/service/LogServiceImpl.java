package com.jay.dubbo.provider.core.service;


import com.jay.dubbo.provider.api.model.LogReq;
import com.jay.dubbo.provider.api.service.LogService;
import org.springframework.stereotype.Service;


@Service
public class LogServiceImpl implements LogService {

    private long i = 0L;

    @Override
    public Long create(LogReq logReq) {
        return i++;
    }

}
