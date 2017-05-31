package com.gm.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * ¿Í»§±í
 * @author MC
 * @date 2017-5-18
 */
@TableName("gm_account")
public class AccountDO implements Serializable {
	
	private Integer id;
	
	private String account;
	
	private String nickname;
	
	private String password;
	
	private String accountType;
	
	private String email;
	
	private String rank;
	
	private Double amount;
	
	private Integer score;
	
	private Integer accountIsActive;
	
	private Integer lockStatus;
	
	private Date lockStartTime;
	
	private Date lockEndTime;
	
	private Date lastLoginTime;
	
	private Date createTime;
	
	private Date modifyTime;
	
	private Integer addressId;

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

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getAccountIsActive() {
		return accountIsActive;
	}

	public void setAccountIsActive(Integer accountIsActive) {
		this.accountIsActive = accountIsActive;
	}

	public Integer getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(Integer lockStatus) {
		this.lockStatus = lockStatus;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "AccountDO [id=" + id + ", account=" + account + ", nickname="
				+ nickname + ", password=" + password + ", accountType="
				+ accountType + ", email=" + email + ", rank=" + rank
				+ ", amount=" + amount + ", score=" + score
				+ ", accountIsActive=" + accountIsActive + ", lockStatus="
				+ lockStatus + ", lockStartTime=" + lockStartTime
				+ ", lockEndTime=" + lockEndTime + ", lastLoginTime="
				+ lastLoginTime + ", createTime=" + createTime
				+ ", modifyTime=" + modifyTime + ", addressId=" + addressId
				+ "]";
	}
	
	
}
