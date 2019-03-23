package com.ctyun.pattern.factory.t4;

/*
抽象工厂，不需要关心产品是哪个厂生产的，只需要从车场提车。外部只需要调用，不用传值，不易出错，
而且代码量少。
 */
public class AbstractFactoryTest  {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();
        System.out.println(factory.getBaoMaCar().getName());
    }
}
