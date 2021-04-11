package com.sys.design.factory.abstractFactory;


import com.sys.design.factory.abstractFactory.base.PhoneInterface;
import org.springframework.stereotype.Component;

/**
 * Created by zhaozongqi on 2019/10/1
 */
@Component("vivoHandler")
public class VivoHandler extends PhoneInterface {

    @Override
    public String play() {
        return"vivo手机进来了";
    }
}
