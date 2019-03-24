package cn.com.weizhen.singleton;

/**
 * 多线程下测试单例模式
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }

}
