package com.ort.dao;
import org.beetl.sql.core.annotatoin.*;
import org.beetl.sql.core.db.KeyHolder;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;
import java.util.List;
import com.ort.entity.*;

/*
* 
* gen by beetlsql mapper 2017-04-24
*/
public interface TMastValDao extends BaseMapper<TMastVal> {

	public List<TMastVal> queryByParams(TMastVal param);
	
	public int updateNoNullById(TMastVal param);
	
	public int deleteById(@Param("memberId") String memberId);
}
