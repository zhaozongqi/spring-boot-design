package com.sys.design.factory.abstractFactory;


import com.sys.design.factory.abstractFactory.base.PhoneInterface;
import org.springframework.stereotype.Component;

/**
 * Created by zhaozongqi on 2019/10/1
 */
@Component("appleHandler")
public class AppleHandler extends PhoneInterface {

    @Override
    public String play() {
       return "苹果手机进来了";
    }
}
