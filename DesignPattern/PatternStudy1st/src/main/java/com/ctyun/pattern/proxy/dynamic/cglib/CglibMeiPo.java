package com.ctyun.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述:
 * @author xiongpf
 * @create 20180719 21:24
 */
public class CglibMeiPo implements MethodInterceptor{

    public Object getInstance(Class<?> clazz) throws  Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
        System.out.println("我是媒婆，我要给你找对象");
        System.out.println("开始物色");
        methodProxy.invokeSuper(o, objects);
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
