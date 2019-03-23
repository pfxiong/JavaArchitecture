package com.ctyun.pattern.decorator.t2;

/**
 * @author xiongpf
 * @desc 装饰者模式
 * @create 20180731 21:15
 */
public class TestDecorator {

    public static void main(String[] args) {
        Car  car = new DecoraterCar(new OriginalCar());
        car.doCarFunction();
    }
}
