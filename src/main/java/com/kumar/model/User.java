package com.kumar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	private long id;
	private String username;
	private String password;
	private String role;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	@Column(name="user-name")
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@Column(name="password")
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	@Column(name="role")
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
