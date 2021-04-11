package com.sys.design.factory.simpleFactory;

import java.math.BigDecimal;

/**
 * Created by zhaozongqi on 2021/4/11
 */
public interface Operation {

    BigDecimal getResult(BigDecimal numberA, BigDecimal numberB) throws Exception;
}
