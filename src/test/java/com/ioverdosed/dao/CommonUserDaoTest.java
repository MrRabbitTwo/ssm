package com.ioverdosed.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import com.ioverdosed.pojo.CommonUser;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-dao.xml"})
public class CommonUserDaoTest {
	
	@Autowired
	private CommonUserMapper cum;
	
	@Test
	public void testSelectById() {
		CommonUser cu;
		
		cu = cum.selectById(1);
		
		if(cu == null)
			System.out.println("22");
		
		System.out.println(cu.getUserAvatar());
	}
	
	@Test
	public void testSelectAll() {
		
		List<CommonUser> list = cum.selectAll();
		
		for(CommonUser user : list) {
			System.out.println(user.getUserNickname());
		}
	}
	
	@Test
	public void testInsertInto() {
		
		CommonUser cu = new CommonUser();
		
		cu.setUserAvatar("6.jpg");
		int flag = cum.insert(cu);
		
	}
	@Test
	public void testDeleteById() {
		cum.deleteById(3);
	}
	
	@Test
	public void testUpdateByCommonUser() {
		
		
		CommonUser cu = new CommonUser();
		cu.setUserAccount("169");
		cu.setUserAvatar("aaa.jpg");
		cu.setUserId(1);
		cu.setUserNickname("过去");
		cu.setUserPassword("15963");
		cu.setUserPhone("110");
		cum.updateByCommonUser(cu);
	}
}
