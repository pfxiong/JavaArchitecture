package com.sec.mybatis.v1;

import com.sec.mybatis.v1.mapper.BlogMapper;

/**
 * @Author: pitt
 */
public class MyBatisBoot {
    public static void main(String[] args) {
        //1.根据Configuration、Executor创建sqlsession
        WZSqlSession sqlSession = new
                WZSqlSession(new WZConfiguration(), new WZExecutor());
        //2.通过sqlsession获取对象接口,通过SqlSession构造出Mappper映射器
        //利用了动态代理技术帮我们生成了这个接口的代理类
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        //3.调用对象接口查询对象
        blogMapper.selectBlogById(1);
    }
}
