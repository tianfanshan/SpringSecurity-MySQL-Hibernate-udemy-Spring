package com.shan.springsecurity.demo.dao;

import com.shan.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleNname);
}
