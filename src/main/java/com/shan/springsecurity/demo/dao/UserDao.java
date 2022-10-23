package com.shan.springsecurity.demo.dao;

import com.shan.springsecurity.demo.entity.User;

public interface UserDao {

	User findByUserName(String userName);
	
	void save(User user);
}
