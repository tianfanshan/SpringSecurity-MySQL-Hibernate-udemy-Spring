package com.shan.springsecurity.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import com.shan.springsecurity.demo.entity.User;
import com.shan.springsecurity.demo.user.CrmUser;

public interface UserService extends UserDetailsService{

	User findByUserName(String userName);
	
	void save(CrmUser crmUser);
}
