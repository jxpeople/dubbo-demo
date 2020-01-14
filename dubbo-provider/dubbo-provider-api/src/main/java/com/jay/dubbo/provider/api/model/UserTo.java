package com.jay.dubbo.provider.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author caoyj
 * @since 2020/1/14 下午3:28
 */
@Data
public class UserTo implements Serializable {

    private String name;
    // 需要聚合的属性
    private String sex;
    private String cityCode;
    private String address;

    private Integer age;
    private String ageStr;

    private Integer version;

}
