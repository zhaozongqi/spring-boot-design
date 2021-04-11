package com.sys.design.factory.simpleFactory;


import java.math.BigDecimal;

/**
 * Created by zhaozongqi on 2021/4/11
 */
public class Add implements Operation {

    @Override
    public BigDecimal getResult(BigDecimal numberA, BigDecimal numberB) throws Exception {
        return numberA.add(numberB);
    }
}
