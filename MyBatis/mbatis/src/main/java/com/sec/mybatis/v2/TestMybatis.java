package com.sec.mybatis.v2;

import com.sec.mybatis.v2.mapper.Blog;
import com.sec.mybatis.v2.mapper.BlogMapper;
import com.sec.mybatis.v2.session.DefaultSqlSession;
import com.sec.mybatis.v2.session.SqlSessionFactory;

/**
 * @Author: pitt
 */
public class TestMybatis {

    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactory();
        DefaultSqlSession sqlSession = factory.build().openSqlSession();
        // 获取MapperProxy代理
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.selectBlogById(1);

        System.out.println("第一次查询: " + blog);
        System.out.println();
        blog = mapper.selectBlogById(1);
        System.out.println("第二次查询: " + blog);
    }
}
