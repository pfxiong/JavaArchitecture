package com.sec.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * @Author: pitt
 */
public class WZConfiguration {
    public static final ResourceBundle sqlMappings;

    static{
        //读取properties配置文件
        sqlMappings = ResourceBundle.getBundle("v1sql");
    }

    //通过BlogMapper.class接口、sqlSession创建动态代理
    public <T> T getMapper(Class clazz, WZSqlSession sqlSession) {
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},  //生成哪些接口的动态代理
                new WZMapperProxy(sqlSession));  //当接口中的方法被调用时，会JVM会回调InvocationHandler的invoke方法
    }


}
