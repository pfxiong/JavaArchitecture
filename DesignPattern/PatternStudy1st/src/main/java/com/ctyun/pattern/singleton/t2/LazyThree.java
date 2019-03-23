package com.ctyun.pattern.singleton.t2;

/**
 * 描述:内部类实现懒汉式
 * 内部类LazyHolder只有在getInstance()方法第一次调用的时候才会被加载（实现了lazy），
 * 而且其加载过程是线程安全的（实现线程安全）。内部类加载的时候实例化一次instance。
 * @author xiongpf
 * @create 20180715 16:19
 */
public class LazyThree {

    private  static  boolean init = false;

    private  LazyThree(){
        synchronized (LazyThree.class){
            if(init==false){
                init = !init;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    public static final  LazyThree getInstance(){
       return  LazyHolder.LAZY_THREE;
    }

    //静态内部类
    private static class LazyHolder{
        private static final LazyThree LAZY_THREE = new LazyThree();
    }
}
