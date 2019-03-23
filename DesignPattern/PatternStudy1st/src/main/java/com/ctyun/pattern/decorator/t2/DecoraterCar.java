package com.ctyun.pattern.decorator.t2;

/**
 * @author xiongpf
 * @desc  提供装饰汽车类
 * @create 20180731 21:12
 */
public class DecoraterCar implements Car {

    private Car car;

    public DecoraterCar(Car car){
        this.car=car;
    }

    @Override
    public void doCarFunction() {
        car.doCarFunction();
        addOnline();
        addNavigation();
    }

    public void addOnline(){
        System.out.println("连上网，能冲浪");
    }

    public void addNavigation(){
        System.out.println("装导航仪，能导航");
    }
}
