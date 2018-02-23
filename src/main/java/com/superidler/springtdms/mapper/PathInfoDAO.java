package com.superidler.springtdms.mapper;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.superidler.springtdms.entities.PathInfo;

/**
 * 电路信息数据访问接口
 */
public interface PathInfoDAO {
	/**
	 * 获得所有电路信息
	 */
	public List<PathInfo> getAllPathInfos();
	/**
	 * 根据电路id获得电路信息对象
	 */
	public PathInfo getPathInfoById(@Param("id") int id);
	
	/**
	 * 根据电路名获得电路信息对象
	 */
	public List<PathInfo> getPathInfosByPathName(@Param("pathName") String pathName,@Param("enable") boolean enable);
	/**
	 * 根据电路编号获得电路信息对象
	 */
	public List<PathInfo> getPathInfosByPathCode(@Param("pathCode") String pathCode,@Param("enable") boolean enable);
	/**
	 * 根据路由信息获得电路信息对象
	 */
	public List<PathInfo> getPathInfosByRouteInfo(@Param("routeInfo") String routeInfo,@Param("enable") boolean enable);
	/**
	 * 根据开通时间获得在用电路信息对象
	 */
	public List<PathInfo> getEnablePathInfosByCreateDate(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	/**
	 * 根据开通时间获得停闭电路信息对象
	 */
	public List<PathInfo> getDisablePathInfosByCreateDate(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	
	/**
	 * 根据组合参数获得在用电路信息对象
	 */
	public List<PathInfo> getEnablePathInfosByMutilParm(@Param("pathName") String pathName,@Param("pathCode") String pathCode,@Param("routeInfo") String routeInfo,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	/**
	 * 根据组合参数获得停闭电路信息对象
	 */
	public List<PathInfo> getDisablePathInfosByMutilParm(@Param("pathName") String pathName,@Param("pathCode") String pathCode,@Param("routeInfo") String routeInfo,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	/**
	 * 添加电路信息
	 */
	public int add(PathInfo entity);
	/**
	 * 根据电路信息id删除电路信息
	 */
	public int delete(int id);
	/**
	 * 更新电路信息
	 */
	public int update(PathInfo entity);
}