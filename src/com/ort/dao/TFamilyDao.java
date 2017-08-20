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
public interface TFamilyDao extends BaseMapper<TFamily> {

	public List<TFamily> queryByParams(TFamily param);
	
	public int updateNoNullById(TFamily param);
	
	public int deleteById(@Param("memberId") String memberId);
}
