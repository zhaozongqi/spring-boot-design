package com.sys.design.controller;

import com.alibaba.fastjson.JSON;
import com.sys.design.singleton.EhSingleton;
import com.sys.design.singleton.LhSingleton;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:zhaozongqi
 * describe:单例模式
 */
@RestController
@RequestMapping("/singleto")
public class SingletonController {

    /**
     * 懒汉模式
     *
     * @return
     */
    @RequestMapping(value = "/lhSingleto", method = RequestMethod.GET)
    public String doLhSingleton() {
        LhSingleton lhSingleton = LhSingleton.getInstance();
        lhSingleton.setName("懒汉模式");
        return JSON.toJSONString(lhSingleton);
    }

    /**
     * 饿汉模式
     *
     * @return
     */
    @RequestMapping(value = "/ehSingleto", method = RequestMethod.GET)
    public String doEhSingleto() {
        EhSingleton ehSingleton = EhSingleton.getInstance();
        ehSingleton.setName("饿汉模式");
        return JSON.toJSONString(ehSingleton);
    }
}
