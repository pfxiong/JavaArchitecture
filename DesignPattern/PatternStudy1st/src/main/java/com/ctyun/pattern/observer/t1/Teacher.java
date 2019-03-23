package com.ctyun.pattern.observer.t1;

import java.util.Observable;

/**
 * @author xiongpf
 * @desc 定义被观察者、发布者，继承Observable类
 * @create 20180731 21:24
 */
public class Teacher extends Observable {

    private String info;

    public void setHomework(String info) {
        this.info = info;
        System.out.println("布置的作业是"+info);
        setChanged();
        notifyObservers();
    }

    public String getInfo() {
        return info;
    }
}
