package com.ioverdosed.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ioverdosed.pojo.CommonUser;

public interface CommonUserMapper {
	CommonUser selectById(Integer id);

	int insert(CommonUser user);

	int updateByCommonUser(CommonUser user);

	int deleteById(Integer id);
	
	List<CommonUser> selectAll();
}
