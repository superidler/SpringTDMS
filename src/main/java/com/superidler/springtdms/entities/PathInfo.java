package com.superidler.springtdms.entities;

import java.util.Date;
/**
 * 电路实体
 */

public class PathInfo {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 电路名
	 */
	private String pathCode;
	/**
	 * 电路编号
	 */
	private String pathName;
	/**
	 * 路由信息
	 */
	private String routeInfo;
	/**
	 * 开通时间
	 */
	private Date createDate;
	
	/**
	 * 关闭时间
	 */
	private boolean enable;
	
	/**
	 * 关闭时间
	 */
	private Date closeDate;
	
	/**
	 * 备注
	 */
	private String memo;

	public PathInfo(int id, String pathCode, String pathName, String routeInfo,Date createDate,boolean enable, Date closeDate,String memo) {
		this.id = id;
		this.pathCode = pathCode;
		this.pathName = pathName;
		this.routeInfo = routeInfo;
		this.memo = memo;
		this.createDate = createDate;
		this.closeDate = closeDate;
		this.enable = enable;
		
	}
	
	public PathInfo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPathCode() {
		return pathCode;
	}

	public void setPathCode(String pathCode) {
		this.pathCode = pathCode;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public String getRouteInfo() {
		return routeInfo;
	}

	public void setRouteInfo(String routeInfo) {
		this.routeInfo = routeInfo;
	}
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.routeInfo = memo;
	}
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	
	public boolean getEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}
