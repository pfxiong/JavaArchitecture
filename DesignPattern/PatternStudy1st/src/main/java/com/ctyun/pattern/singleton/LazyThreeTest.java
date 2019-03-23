package com.ctyun.pattern.singleton;

import com.ctyun.pattern.singleton.t2.LazyThree;

import java.lang.reflect.Constructor;

/**
 * 描述:
 *
 * @author xiongpf
 * @create 20180715 19:27
 */
public class LazyThreeTest {

    public static void main(String[] args) {

        try {

            //进行破坏
            Class<?> clazz = LazyThree.class;

            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);

            //暴力初始化
            Object o1 = c.newInstance();


            //调用了两次构造方法，相当于new了两次
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
