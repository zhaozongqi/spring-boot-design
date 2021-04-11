package com.sys.design.controller;

import com.alibaba.fastjson.JSON;
import com.sys.design.builder.ConcreteBuilder;
import com.sys.design.builder.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:zhaozongqi
 * describe:建造者模式
 */
@RestController
@RequestMapping("/builder")
public class BuilderController {

    /**
     * 建造者模式
     *
     * @return
     */
    @RequestMapping(value = "/builder", method = RequestMethod.POST)
    public String doBuilder() {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        concreteBuilder.bulidA("牛肉煲");
        concreteBuilder.bulidB("可乐");
        concreteBuilder.bulidC("全家桶");
        concreteBuilder.bulidD("冰淇淋");
        Product build = concreteBuilder.build();

        return JSON.toJSONString(build.toString());
    }

}
