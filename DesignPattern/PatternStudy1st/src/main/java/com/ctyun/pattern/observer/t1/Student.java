package com.ctyun.pattern.observer.t1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiongpf
 * @desc  具体观察者、订阅者，实现Observer接口
 * @create 20180731 21:27
 */
public class Student implements Observer {

    private Observable ob;  //观察者
    private String name;

    public Student(String name, Observable ob) {
        this.ob = ob;
        this.name = name;
        ob.addObserver(this); //当前对象作为被观察者
    }

    @Override
    public void update(Observable o, Object arg) {
        Teacher t=(Teacher)o;  //老师是观察者
        System.out.println(name+"得到作业信息:"+t.getInfo());
    }
}
