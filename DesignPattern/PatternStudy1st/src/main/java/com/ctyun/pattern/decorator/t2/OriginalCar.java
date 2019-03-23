package com.ctyun.pattern.decorator.t2;

/**
 * @author xiongpf
 * @desc 原始汽车类（被装修类）
 * @create 20180731 21:09
 */
public class OriginalCar implements Car {

    @Override
    public void doCarFunction() {
        System.out.println("可以载物");
        System.out.println("可以运行");
    }
}
