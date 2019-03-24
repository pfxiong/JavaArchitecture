package cn.com.weizhen.singleton;

import cn.com.weizhen.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 内部类单例
 * 不允許通過反射方式构造对象
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            //很无聊的情况下，进行破坏
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问，强吻，不愿意也要吻
            c.setAccessible(true);
            //暴力初始化
            Object o1 = c.newInstance();

            //调用了两次构造方法，相当于new了两次
            //犯了原则性问题，
            Object o2 = c.newInstance();
            //正常渠道
            Object o3 = LazyInnerClassSingleton.getInstance();
            System.out.println(o1 == o3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
