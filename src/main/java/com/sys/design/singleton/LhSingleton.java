package com.sys.design.singleton;

import lombok.Data;

/**
 * author: zhaozongqi
 * describe:设计模式之单例模式(懒汉)
 */
@Data
public class LhSingleton {

    /**
     * 懒汉单例模式
     */

    private static LhSingleton instance = null;


    public static synchronized LhSingleton getInstance() {

        if (instance == null) {

            instance = new LhSingleton();

        }
        return instance;

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
