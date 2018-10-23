package com.ioverdosed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ioverdosed.dao.CommonUserMapper;
import com.ioverdosed.pojo.CommonUser;
import com.ioverdosed.service.CommonUserService;

@Service
public class CommonUserServiceImpl implements CommonUserService{
	@Autowired
	private CommonUserMapper cum;

	@Override
	public CommonUser selectById(Integer id) {
		CommonUser cu;
		
		cu = cum.selectById(id);
		return cu;
	}

	@Override
	public int insert(CommonUser user) {
		cum.insert(user);
		return 0;
	}

	@Override
	public int updateByCommonUser(CommonUser user) {
		cum.updateByCommonUser(user);
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		cum.deleteById(id);
		return 0;
	}

	@Override
	public List<CommonUser> selectAll() {
		
		return cum.selectAll();
	
	}
}
