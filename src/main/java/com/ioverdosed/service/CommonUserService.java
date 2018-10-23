package com.ioverdosed.service;

import java.util.List;

import com.ioverdosed.pojo.CommonUser;

public interface CommonUserService {
	
	CommonUser selectById(Integer id);

	int insert(CommonUser user);

	int updateByCommonUser(CommonUser user);

	int deleteById(Integer id);
	
	List<CommonUser> selectAll();
	
}
