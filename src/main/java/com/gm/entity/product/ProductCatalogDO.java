package com.gm.entity.product;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 商品目录表实体
 * @author MC
 * @date 2017-6-7
 */
@TableName("gm_product_catalog")
public class ProductCatalogDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String code;
	
	private Integer pid;
	
	private Integer level;
	
	private String path;
	
	private Integer sort;
	
	private String ifShowInNav;
	
	private String createAccount;
	
	private Date createTime;
	
	private String updateAccount;
	
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getIfShowInNav() {
		return ifShowInNav;
	}

	public void setIfShowInNav(String ifShowInNav) {
		this.ifShowInNav = ifShowInNav;
	}

	public String getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateAccount() {
		return updateAccount;
	}

	public void setUpdateAccount(String updateAccount) {
		this.updateAccount = updateAccount;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
