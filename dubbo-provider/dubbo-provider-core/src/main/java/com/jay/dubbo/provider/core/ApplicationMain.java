package com.jay.dubbo.provider.core;

import com.github.jay.merge.EnableMerge;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication(exclude = PersistenceExceptionTranslationAutoConfiguration.class)
@DubboComponentScan(basePackages = "com.jay.dubbo.provider.core.api.impl")
@EnableMerge
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date()) + " Dubbo service server started!");
    }
}
