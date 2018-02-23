package com.superidler.springtdms.mapper;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.superidler.springtdms.entities.PathInfo;

/**
 * ��·��Ϣ���ݷ��ʽӿ�
 */
public interface PathInfoDAO {
	/**
	 * ������е�·��Ϣ
	 */
	public List<PathInfo> getAllPathInfos();
	/**
	 * ���ݵ�·id��õ�·��Ϣ����
	 */
	public PathInfo getPathInfoById(@Param("id") int id);
	
	/**
	 * ���ݵ�·����õ�·��Ϣ����
	 */
	public List<PathInfo> getPathInfosByPathName(@Param("pathName") String pathName,@Param("enable") boolean enable);
	/**
	 * ���ݵ�·��Ż�õ�·��Ϣ����
	 */
	public List<PathInfo> getPathInfosByPathCode(@Param("pathCode") String pathCode,@Param("enable") boolean enable);
	/**
	 * ����·����Ϣ��õ�·��Ϣ����
	 */
	public List<PathInfo> getPathInfosByRouteInfo(@Param("routeInfo") String routeInfo,@Param("enable") boolean enable);
	/**
	 * ���ݿ�ͨʱ�������õ�·��Ϣ����
	 */
	public List<PathInfo> getEnablePathInfosByCreateDate(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	/**
	 * ���ݿ�ͨʱ����ͣ�յ�·��Ϣ����
	 */
	public List<PathInfo> getDisablePathInfosByCreateDate(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	
	/**
	 * ������ϲ���������õ�·��Ϣ����
	 */
	public List<PathInfo> getEnablePathInfosByMutilParm(@Param("pathName") String pathName,@Param("pathCode") String pathCode,@Param("routeInfo") String routeInfo,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	/**
	 * ������ϲ������ͣ�յ�·��Ϣ����
	 */
	public List<PathInfo> getDisablePathInfosByMutilParm(@Param("pathName") String pathName,@Param("pathCode") String pathCode,@Param("routeInfo") String routeInfo,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	/**
	 * ��ӵ�·��Ϣ
	 */
	public int add(PathInfo entity);
	/**
	 * ���ݵ�·��Ϣidɾ����·��Ϣ
	 */
	public int delete(int id);
	/**
	 * ���µ�·��Ϣ
	 */
	public int update(PathInfo entity);
}