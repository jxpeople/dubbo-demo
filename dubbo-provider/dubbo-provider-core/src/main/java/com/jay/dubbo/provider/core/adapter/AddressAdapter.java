package com.jay.dubbo.provider.core.adapter;

import com.jay.dubbo.provider.core.dto.AddressDto;

import java.util.List;
import java.util.Map;

/**
 * @author caoyj
 * @since 2020/1/14 下午3:30
 */
public interface AddressAdapter {

    AddressDto getAddress(String cittyCode);


    Map<String,AddressDto> getAddressByCode(List<String> cityCodeList);
}
