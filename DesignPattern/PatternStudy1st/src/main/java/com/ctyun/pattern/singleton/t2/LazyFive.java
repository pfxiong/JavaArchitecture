package com.ctyun.pattern.singleton.t2;

/**
 * 描述:解决无序写懒汉式单例
 * @author xiongpf
 * @create 20180716 20:40
 */
public class LazyFive {

    //单例实例变量
    private static LazyFive instance = null;

    //私有化的构造方法，保证外部的类不能通过构造器来实例化
    private LazyFive() {}

    //获取单例对象实例
    public static LazyFive getInstance() {
        if (instance == null) {
            synchronized (LazyFive.class) {                  //1
                LazyFive temp = instance;                //2
                if (temp == null) {
                    synchronized (LazyFive.class) {  //3
                        temp = new LazyFive();   //4
                    }
                    instance = temp;                  //5
                }
            }
        }
        System.out.println("解决无序写懒汉式单例！");
        return instance;
    }
}
