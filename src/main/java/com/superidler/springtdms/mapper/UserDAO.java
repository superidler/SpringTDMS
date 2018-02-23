package com.superidler.springtdms.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.superidler.springtdms.entities.User;

/**
 * 用户数据访问接口
 */
public interface UserDAO {
	/**
	 * 获得所有用户
	 */
	public List<User> getAllUsers();
	/**
	 * 根据用户id获得用户对象
	 */
	public User getUserById(@Param("id") int id);
	
	/**
	 * 根据用户名获得用户对象
	 */
	public User getUserByUserName(@Param("userName") String userName);
	
	/**
	 * 添加用户
	 */
	public int add(User entity);
	/**
	 * 根据用户id删除用户
	 */
	public int delete(int id);
	/**
	 * 更新用户
	 */
	public int update(User entity);
}