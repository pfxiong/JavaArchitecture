package com.sec.mybatis.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: pitt
 */
public class WZMapperProxy implements InvocationHandler {
    private WZSqlSession sqlSession;

    public WZMapperProxy(WZSqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    /*
    当接口中的任何一个方法被调用时，JVM都会回调InvocationHandler接口实现类的invoke方法。并会传递三个回调参数：
    Object proxy：被代理的类
    Method method：表示当前被调用的接口的方法对象
    Object[] args：表示接口方法被调用时，传递的参数。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mapperInterface = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = mapperInterface + "." + methodName;
        System.out.println("statementId:" +statementId);
        return sqlSession.selectOne(statementId, args[0]);
    }
}
