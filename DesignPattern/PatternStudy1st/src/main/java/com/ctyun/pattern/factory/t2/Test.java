package com.ctyun.pattern.factory.t2;

public class Test {

      public  static void  main(String[] args){

          Milk milk = new MilkFactory().getMilk("Yini");
          System.out.println(milk.getName());
      }
}
