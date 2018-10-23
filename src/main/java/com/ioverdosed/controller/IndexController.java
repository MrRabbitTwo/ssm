
package com.ioverdosed.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ioverdosed.pojo.CommonUser;
import com.ioverdosed.service.CommonUserService;


@Controller
public class IndexController {
	private static final String INDEX = "index";
	private static final String INDEXVIDEODETAILS = "indexVideoDetails";
	@Autowired
	private CommonUserService cus;
	
	
	@RequestMapping(value="/select/{id}",method=RequestMethod.GET)
	@ResponseBody
	public CommonUser selectById(@PathVariable Integer id) {
		CommonUser cu = cus.selectById(id);
		return cu;
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	@ResponseBody
	public List<CommonUser> selectAll() {
		List<CommonUser> list = cus.selectAll();
		return list;
	}

	@RequestMapping(value="/update",method=RequestMethod.POST)
	@ResponseBody
	public String updateByCommonUser(@RequestBody CommonUser user) {
		/* 
		 * postman send
		   {
				"userId" : 2 ,
				"userAvatar" : "999.jpg",
				"userNickname" : "111",
				"userPhone" : "111",
				"userAccount" : "111",
				"userPassword" : "111"
			}
		 */	
		cus.updateByCommonUser(user);
		System.out.println(user.getUserAvatar());
		return user.getUserAvatar();
	}

	public int deleteById(Integer id) {
		cus.deleteById(id);
		return 0;
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public void insert(@RequestBody CommonUser user) {
		/* 
		 * postman send
		   {
				"userAvatar" : "999.jpg",
				"userNickname" : "111",
				"userPhone" : "111",
				"userAccount" : "111",
				"userPassword" : "111"
			}
		 */	
		cus.insert(user);
		
		
	}
}
