package com.superidler.springtdms.entities;

/**
 * 用户实体
 */
public class User {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 级别
	 */
	private int level;

	public User(int id, String userName, String password, int level) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.level = level;
	}
	
	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
