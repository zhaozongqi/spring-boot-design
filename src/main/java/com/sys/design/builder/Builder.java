package com.sys.design.builder;


/**
 * Created by zhaozongqi on 2021/4/11
 */
 abstract class Builder {

    //汉堡
    public abstract Builder bulidA(String mes);

    //饮料
    public abstract Builder bulidB(String mes);

    //薯条
    public abstract Builder bulidC(String mes);

    //甜品
    public abstract Builder bulidD(String mes);

    //获取套餐
    public abstract Product build();
}
