package com.ctyun.pattern.singleton;

import com.ctyun.pattern.singleton.t2.Lazy;
import com.ctyun.pattern.singleton.t2.LazyThree;
import com.ctyun.pattern.singleton.t3.RegisterEnum;
import com.ctyun.pattern.singleton.t3.RegisterMap;

import java.util.concurrent.CountDownLatch;

/**
 * 描述:单例模式测试
 * @author xiongpf
 * @create 20180715 15:25
 */
public class ThreadSafeTest {

    public static void main(String[] args) {
        int count = 1000;

        //发令枪
        final CountDownLatch countDownLatch = new CountDownLatch(count);

        for(int i=0; i< count; i++){

            new Thread(){
                @Override
                public void run() {

                    try {
                        countDownLatch.await(); //阻塞，count为0时，会释放所有共享锁，万箭齐发
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    Object obj = LazyThree.getInstance();
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }

            }.start();

            countDownLatch.countDown(); //减一
        }

    }

}
