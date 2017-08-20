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
public interface TMasterDao extends BaseMapper<TMaster> {

	public List<TMaster> queryByParams(TMaster param);
	
	public int updateNoNullById(TMaster param);
	
	public int deleteById(@Param("memberId") String memberId);
}
