package com.ctyun.pattern.observer.t1;

/**
 * @author xiongpf
 * @desc
 * 观察者模式(Observer 发布-订阅):定义了一种一对多的依赖关系，
 * 让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 * @create 20180731 21:31
 */
public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student("张三", teacher);
        Student student2 = new Student("李四", teacher);
        teacher.setHomework("写一篇800字的作文");

    }
}
