package com.sys.design.singleton;

import lombok.Data;

/**
 * author: zhaozongqi
 * describe:设计模式之单例模式(饿汉)
 */
@Data
public class EhSingleton {

    /**
     * 饿汉单例模式
     */
    private static EhSingleton instance = new EhSingleton();

    public static EhSingleton getInstance()

    {
        return instance;
    }

    private String name;


}
