package cn.com.weizhen.singleton.threadlocal;

/**
 * @author fpxiong
 * @description: 每个ThreadLocal只能保存一个变量副本，
 * 如果想要上线一个线程能够保存多个副本以上，就需要创建多个ThreadLocal
 * ThreadLocal核心机制：
 * 每个Thread线程内部都有一个Map。
 * Map里面存储线程本地对象（key）和线程的变量副本（value）
 * 但是，Thread内部的Map是由ThreadLocal维护的，由ThreadLocal负责向map获取和设置线程的变量值。
 * @date 2019/3/2411:38
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
