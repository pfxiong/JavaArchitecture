package com.ctyun.pattern.singleton.t2;

/**
 * 描述:双重锁定懒汉式单例
 * 缺点：无序写使之失效
 * @author xiongpf
 * @create 20180716 20:35
 */
public class LazyFour {

    //单例实例变量
    private static LazyFour instance = null;

    //私有化的构造方法，保证外部的类不能通过构造器来实例化
    private LazyFour() {}

    //获取单例对象实例
    public static LazyFour getInstance() {
        if (instance == null) {
            synchronized (LazyFour.class) {
                if (instance == null) {
                    instance = new LazyFour(); //调用构造方法，创建了一个实例。2、把这个实例赋值给instance这个实例变量。
                    // 可问题就是，这两步jvm是不保证顺序的。也就是说。可能在调用构造方法之前，instance已经被设置为非空了。
                }
            }
        }
        System.out.println("双重锁定懒汉式单例！");
        return instance;
    }
}
