package com.ctyun.pattern.proxy.dynamic.jdk;

import com.ctyun.pattern.proxy.staticed.t2.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiongpf
 * @create 20180719 7:42
 */
public class JDKMeiPo implements InvocationHandler {

    private Person person;

    public Object getInstance(Person person) throws  Exception{

        this.person = person;
        Class<?> clazz = person.getClass();
        //字节码是如何重组,用来生成一个新的对象（字节码重组来实现）
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是媒婆，开始物色");
        method.invoke(this.person, args);
        System.out.println("见面撮合");
        return null;
    }
}
