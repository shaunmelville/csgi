package com.shaunmelville.poc.auth.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	private String password;

	@Id
	@Column(name = "username")
	private String username;

	public Users() {
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}