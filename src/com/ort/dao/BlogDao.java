package com.ort.dao;

import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import com.ort.entity.Blog;

public interface BlogDao extends BaseMapper<Blog> {
	
	public void sample(PageQuery<Blog> pq);

}
