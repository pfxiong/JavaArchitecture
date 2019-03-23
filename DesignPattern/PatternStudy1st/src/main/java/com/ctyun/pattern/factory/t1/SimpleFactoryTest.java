package com.ctyun.pattern.factory.t1;

/*
简单工厂测试
缺点: 添加产品时: 需要补充产品，再在工厂生成产品，外部调用时需要传值
      外部传值错误时，易发生错误
 */
public class SimpleFactoryTest {

     public static void main(String[] agrs){

         SimpleFactory simpleFactory = new SimpleFactory();
         System.out.println(simpleFactory.getCar("BaoMa").getName());

     }
}
