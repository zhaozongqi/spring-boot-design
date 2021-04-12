package com.sys.design.factory.abstractFactory;


import com.sys.design.factory.abstractFactory.base.PhoneInterface;
import org.springframework.stereotype.Component;

/**
 * author:zhaozongqi
 * describe:vivo手机控制器
 */
@Component("vivoHandler")
public class VivoHandler extends PhoneInterface {

    @Override
    public String play() {
        return "vivo手机进来了";
    }

}
