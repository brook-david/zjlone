package com.ort.dao;
import org.beetl.sql.core.annotatoin.*;
import org.beetl.sql.core.db.KeyHolder;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;
import java.util.List;
import com.ort.entity.*;

/*
* 
* gen by beetlsql mapper 2017-08-31
*/
public interface UserRolesDao extends BaseMapper<UserRoles> {

	public List<UserRoles> queryByParams(UserRoles param);
	
	public int updateNoNullById(UserRoles param);
	
	public int deleteById(@Param("memberId") String memberId);
}
