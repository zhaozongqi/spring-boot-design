package com.sys.design.factory.abstractFactory;

import lombok.Data;

import java.math.BigDecimal;

/**
 * author:zhaozongqi
 * describe:加减乘除实体
 */
@Data
public class OperationParam {

    /**
     * 类型：+ — * /
     */
    private String type;

    /**
     * 第一个数
     */
    private BigDecimal a;

    /**
     * 第二个数
     */
    private BigDecimal b;
}
