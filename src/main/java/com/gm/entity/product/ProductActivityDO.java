package com.gm.entity.product;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 商品活动表实体
 * @author MC
 * @date 2017-6-7
 */
@TableName("gm_product_activity")
public class ProductActivityDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String accountRange;
	
	private String content;
	
	private String status;
	
	private String activityType;
	
	private String discountType;
	
	private Double discount;
	
	private String discountUnit;
	
	private Double rightPrice;
	
	private Integer maxSellCount;
	
	private Integer minGroupCount;
	
	private Double groupPrice;
	
	private Integer inGroupPerson;
	
	private String remark;
	
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

	public String getAccountRange() {
		return accountRange;
	}

	public void setAccountRange(String accountRange) {
		this.accountRange = accountRange;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDiscountUnit() {
		return discountUnit;
	}

	public void setDiscountUnit(String discountUnit) {
		this.discountUnit = discountUnit;
	}

	public Double getRightPrice() {
		return rightPrice;
	}

	public void setRightPrice(Double rightPrice) {
		this.rightPrice = rightPrice;
	}

	public Integer getMaxSellCount() {
		return maxSellCount;
	}

	public void setMaxSellCount(Integer maxSellCount) {
		this.maxSellCount = maxSellCount;
	}

	public Integer getMinGroupCount() {
		return minGroupCount;
	}

	public void setMinGroupCount(Integer minGroupCount) {
		this.minGroupCount = minGroupCount;
	}

	public Double getGroupPrice() {
		return groupPrice;
	}

	public void setGroupPrice(Double groupPrice) {
		this.groupPrice = groupPrice;
	}

	public Integer getInGroupPerson() {
		return inGroupPerson;
	}

	public void setInGroupPerson(Integer inGroupPerson) {
		this.inGroupPerson = inGroupPerson;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
