package com.ctyun.pattern.factory.t3;

/*
工厂方法：
需要某种产品，去找对应的工厂生产，对应的工厂只生产对应的产品，而不像简单工厂可以生产很多产品
 */
public class FactoryMethodTest {

    public static void  main(String[] agrs){

        Factory factory = new BaoMaFactory();
        System.out.println(factory.getCar().getName());
    }
}
