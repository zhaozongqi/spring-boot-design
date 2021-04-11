package com.sys.design.factory.abstractFactory.base;

import com.sys.design.factory.abstractFactory.enums.PhoneHandleTypeEnum;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaozongqi on 2019/10/1
 */
@Repository
public class PhoneManager {

    @Resource
    private Map<String, PhoneInterface> phoneHandlerMaps = new HashMap<>();

    public PhoneInterface getMsgHandlerByMsgType(PhoneHandleTypeEnum phoneHandleTypeEnum) {
        return phoneHandlerMaps.get(phoneHandleTypeEnum.getHandle());
    }
}
