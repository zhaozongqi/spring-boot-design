package com.sys.design.factory.abstractFactory;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by zhaozongqi on 2021/4/11
 */
@Data
public class OperationParam {
    private String type;
    private BigDecimal a;
    private BigDecimal b;
}
