package com.sys.design.factory.simpleFactory;


import java.math.BigDecimal;

/**
 * author:zhaozongqi
 * describe:加法
 */
public class Add implements Operation {

    @Override
    public BigDecimal getResult(BigDecimal numberA, BigDecimal numberB) throws Exception {
        return numberA.add(numberB);
    }
}
