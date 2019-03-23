package com.ctyun.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * 描述:
 * @author xiongpf
 * @create 20180720 22:46
 */
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
