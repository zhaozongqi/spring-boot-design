package com.sys.design.controller;

import com.sys.design.factory.abstractFactory.OperationParam;
import com.sys.design.factory.abstractFactory.base.PhoneManager;
import com.sys.design.factory.abstractFactory.enums.PhoneHandleTypeEnum;
import com.sys.design.factory.simpleFactory.Add;
import com.sys.design.factory.simpleFactory.Operation;
import com.sys.design.factory.simpleFactory.Sub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * author:zhaozongqi
 * describe:工厂模式
 */
@RestController
@RequestMapping("/factory")
public class FactoryController {

    @Autowired
    private PhoneManager phoneManager;


    /**
     * 抽象工厂
     *
     * @param type
     * @return
     */
    @RequestMapping(value = "/play", method = RequestMethod.POST)
    public String doPhone(String type) {
        String msg = phoneManager.getMsgHandlerByMsgType(PhoneHandleTypeEnum.getByValue(type))
                .play();
        return msg;
    }

    /**
     * 简单工厂
     *
     * @param operationParam
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/operation", method = RequestMethod.POST)
    public BigDecimal doOperation(@RequestBody OperationParam operationParam) throws Exception {
        Operation operationObj = null;
        switch (operationParam.getType()) {
            case "+":
                operationObj = new Add();
                break;
            case "-":
                operationObj = new Sub();
                break;
        }
        return operationObj.getResult(operationParam.getA(), operationParam.getB());
    }
}
