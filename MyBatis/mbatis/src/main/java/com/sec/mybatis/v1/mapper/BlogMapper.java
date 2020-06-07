package com.sec.mybatis.v1.mapper;

import com.sec.mybatis.v2.annotation.Entity;
import com.sec.mybatis.v2.annotation.Select;

/**
 * @Author: pitt
 */
@Entity(Blog.class)
public interface BlogMapper {
    /**
     * 根据主键查询文章
     * @param bid
     * @return
     */
    @Select("select * from blog where bid = ? ")
    public Blog selectBlogById(Integer bid);

}
