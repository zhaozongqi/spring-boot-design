package com.sys.design.factory.simpleFactory;

import java.math.BigDecimal;

/**
 * author:zhaozongqi
 * describe:得到结果（加减）
 */
public interface Operation {

    BigDecimal getResult(BigDecimal numberA, BigDecimal numberB) throws Exception;

}
