package com.sys.design.factory.abstractFactory;


import com.sys.design.factory.abstractFactory.base.PhoneInterface;
import org.springframework.stereotype.Component;

/**
 * author:zhaozongqi
 * describe:苹果手机控制器
 */
@Component("appleHandler")
public class AppleHandler extends PhoneInterface {

    @Override
    public String play() {
       return "苹果手机进来了";
    }

}
