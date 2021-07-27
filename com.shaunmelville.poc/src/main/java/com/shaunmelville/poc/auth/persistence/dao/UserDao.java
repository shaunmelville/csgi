package com.shaunmelville.poc.auth.persistence.dao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.shaunmelville.poc.auth.persistence.model.Users;
import com.shaunmelville.poc.base.persistence.BaseDao;

@Component("userDao")
public class UserDao extends BaseDao {

	@PostConstruct
	public void init() {
		super.setClazz(Users.class);
	}

}
