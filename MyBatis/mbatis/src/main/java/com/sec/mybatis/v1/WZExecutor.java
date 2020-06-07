package com.sec.mybatis.v1;

import com.sec.mybatis.v1.mapper.Blog;

import java.sql.*;
import java.util.List;

/**
 * @Author: pitt
 */
public class WZExecutor {

    //根据sql、传参执行sql语句
    public <T> T query(String sql, Object paramater) {
        Connection conn = null;
        Statement stmt = null;
        Blog blog = new Blog();

        try {
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis",
                    "root", "root");

            // 执行查询
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(String.format(sql, paramater));

            // 获取结果集
            while (rs.next()) {
                Integer bid = rs.getInt("bid");
                String name = rs.getString("name");
                Integer authorId = rs.getInt("authorId");
                blog.setAuthorId(authorId);
                blog.setBid(bid);
                blog.setName(name);
            }
            System.out.println(blog);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return (T)blog;
    }

    /**
     * 这个<T> T 可以传入任何类型的List
     * 参数T
     *     第一个 表示是泛型
     *     第二个 表示返回的是T类型的数据
     *     第三个 限制参数类型为T
     * @param data
     * @return
     */
    private <T> T getList1(List<T> data){
        return null;
    }

    /**
     * 这个只能传递T类型的数据
     * 返回值 就是WZExecutor<T> 实例化传递的对象类型
     * @param data
     * @return
     */
    /*private T getList2(List<T> data){
        return null;
    }*/
}
