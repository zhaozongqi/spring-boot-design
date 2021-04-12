package com.sys.design.factory.simpleFactory;

import java.math.BigDecimal;

/**
 * author:zhaozongqi
 * describe:减法
 */
public class Sub implements Operation {

    @Override
    public BigDecimal getResult(BigDecimal numberA, BigDecimal numberB) throws Exception {
        return numberA.subtract(numberB);
    }

}
