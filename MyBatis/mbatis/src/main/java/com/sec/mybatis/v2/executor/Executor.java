package com.sec.mybatis.v2.executor;

/**
 * @Author: pitt
 */
public interface Executor {
    <T> T query(String statement, Object[] parameter, Class pojo);
}
