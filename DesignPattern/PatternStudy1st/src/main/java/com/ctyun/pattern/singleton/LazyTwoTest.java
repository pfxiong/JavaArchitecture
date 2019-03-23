package com.ctyun.pattern.singleton;

import com.ctyun.pattern.singleton.t2.LazyTwo;

/**
 * 描述:性能测试
 * @author xiongpf
 * @create 20180715 16:01
 */
public class LazyTwoTest {

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        for(int i=0; i< 1000000; i++){
            Object obj = LazyTwo.getInstance();
        }
        Long end = System.currentTimeMillis();
        System.out.println("总耗时:"+ (end - start));
    }
}
