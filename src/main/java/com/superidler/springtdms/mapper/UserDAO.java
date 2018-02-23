package com.superidler.springtdms.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.superidler.springtdms.entities.User;

/**
 * �û����ݷ��ʽӿ�
 */
public interface UserDAO {
	/**
	 * ��������û�
	 */
	public List<User> getAllUsers();
	/**
	 * �����û�id����û�����
	 */
	public User getUserById(@Param("id") int id);
	
	/**
	 * �����û�������û�����
	 */
	public User getUserByUserName(@Param("userName") String userName);
	
	/**
	 * ����û�
	 */
	public int add(User entity);
	/**
	 * �����û�idɾ���û�
	 */
	public int delete(int id);
	/**
	 * �����û�
	 */
	public int update(User entity);
}