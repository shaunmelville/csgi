package com.shaunmelville.poc.auth.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.shaunmelville.poc.auth.persistence.model.Users;
import com.shaunmelville.poc.base.interfaces.IDao;

@Component
public class PocUserService implements UserDetailsService {

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Autowired
	@Qualifier("userDao")
	private IDao<Users> userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		// Load from DB
		Users user = userDao.findOne(username);

		if (username != null && user != null && username.equals(user.getUsername())) {
			return new User(user.getUsername(), user.getPassword(), new ArrayList<>());

		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}
