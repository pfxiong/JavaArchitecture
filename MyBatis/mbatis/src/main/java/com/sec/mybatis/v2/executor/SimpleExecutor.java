package com.sec.mybatis.v2.executor;

/**
 * @Author: pitt
 */
public class SimpleExecutor implements Executor {
    @Override
    public <T> T query(String statement, Object[] parameter, Class pojo) {
        StatementHandler statementHandler = new StatementHandler();
        return statementHandler.query(statement, parameter, pojo);
    }
}
