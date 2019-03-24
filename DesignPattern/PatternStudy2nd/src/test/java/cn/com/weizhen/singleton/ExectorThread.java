package cn.com.weizhen.singleton;


import cn.com.weizhen.singleton.threadlocal.ThreadLocalSingleton;

/**
 * 执行单例的线程
 */
public class ExectorThread implements Runnable{

    @Override
    public void run() {
        //LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }

}
