package com.sys.design.builder;

/**
 * author:zhaozongqi
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public Product build() {
        return product;
    }

    @Override
    public Builder bulidA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    public Builder bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    public Builder bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    public Builder bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
}