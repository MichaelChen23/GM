package com.gm.entity.custom;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 客户表实体
 * @author MC
 * @date 2017-5-18
 */
@TableName("gm_custom")
public class CustomDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String account;
	
	private String name;
	
	private String nickname;
	
	private String password;
	
	private String accountType;
	
	private String email;
	
	private String rank;
	
	private Double amount;
	
	private Double score;
	
	private String ifActive;
	
	private String ifLock;
	
	private Date lockStartTime;
	
	private Date lockEndTime;
	
	private Date lastLoginTime;
	
	private Integer addressId;
	
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getIfActive() {
		return ifActive;
	}

	public void setIfActive(String ifActive) {
		this.ifActive = ifActive;
	}

	public String getIfLock() {
		return ifLock;
	}

	public void setIfLock(String ifLock) {
		this.ifLock = ifLock;
	}

	public Date getLockStartTime() {
		return lockStartTime;
	}

	public void setLockStartTime(Date lockStartTime) {
		this.lockStartTime = lockStartTime;
	}

	public Date getLockEndTime() {
		return lockEndTime;
	}

	public void setLockEndTime(Date lockEndTime) {
		this.lockEndTime = lockEndTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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
