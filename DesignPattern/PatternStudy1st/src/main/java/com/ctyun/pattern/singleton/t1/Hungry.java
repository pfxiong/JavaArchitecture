package com.ctyun.pattern.singleton.t1;

/**
 * 描述:饿汉模式，不管你用不用，我都New出来，线程安全
 * @author xiongpf
 * @create 20180715 15:13
 */
public class Hungry {

    private Hungry(){

    }

    //static的，在类加载时进行初始化一次，保证线程安全
    private static final Hungry hungry= new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }

}
