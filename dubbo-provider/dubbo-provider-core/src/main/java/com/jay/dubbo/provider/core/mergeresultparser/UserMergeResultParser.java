package com.jay.dubbo.provider.core.mergeresultparser;

import com.github.jay.merge.facade.IMergeResultParser;
import com.jay.dubbo.provider.core.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author caoyj
 * @since 2020/1/14 下午10:40
 */
@Component
public class UserMergeResultParser implements IMergeResultParser {
    @Override
    public List<UserDto> parser(Object methodResult) {
        List<UserDto> resultt = (List<UserDto>)methodResult;
        resultt.stream().forEach(userDto -> {
            userDto.setVersion(userDto.getVersion()+100);
        });
        return resultt;
    }
}
