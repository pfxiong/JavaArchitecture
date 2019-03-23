package com.ctyun.pattern.singleton.t2;

/**
 * 描述:懒汉模式, 有线程不安全
 * @author xiongpf
 * @create 20180715 15:52
 */
public class Lazy {

    private  Lazy(){
    }

    private static Lazy lazy = null;

    public static Lazy getInstance(){
        if(lazy==null){
            lazy = new Lazy();
        }
        return lazy;
    }
}
