package com.ioverdosed.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ioverdosed.pojo.CommonUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-service.xml"})
public class CommonUserServiceTest {
	@Autowired
	CommonUserService cus;
	@Test
	public void testSelectById() {
		
		CommonUser cu = cus.selectById(1);
		System.out.println(cu.getUserNickname());
	}
	
}
