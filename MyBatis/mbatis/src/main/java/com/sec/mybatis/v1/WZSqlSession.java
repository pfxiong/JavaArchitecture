package com.sec.mybatis.v1;

/**
 * @Author: pitt
 */
public class WZSqlSession {
    private WZConfiguration configuration;

    private WZExecutor executor;

    public WZSqlSession(WZConfiguration configuration, WZExecutor executor){
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object paramater){
        // 根据properties中statementId拿到SQL
        String sql = WZConfiguration.sqlMappings.getString(statementId);
        if(null != sql && !"".equals(sql)){
            //执行sql语句
            return executor.query(sql, paramater);
        }
        return null;
    }

    public <T> T getMapper(Class clazz){
        //获取MapperProxy的代理类
        //BlogMapper.class
        return configuration.getMapper(clazz, this);
    }

}
