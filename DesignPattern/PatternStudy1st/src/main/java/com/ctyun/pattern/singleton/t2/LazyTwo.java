package com.ctyun.pattern.singleton.t2;

/**
 * 描述:懒汉式，线程安全
 * @author xiongpf
 * @create 20180715 16:06
 */
public class LazyTwo {

    private  LazyTwo(){
    }

    private static LazyTwo lazyTwo = null;

    public synchronized static LazyTwo getInstance(){
        if(lazyTwo==null){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}
