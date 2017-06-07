package com.gm.entity.order;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 订单表实体
 * @author MC
 * @date 2017-6-7
 */
@TableName("gm_order")
public class OrderDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String orderNo;
	
	private String account;
	
	private String payType;
	
	private String carry;
	
	private Double carryFeeTotal;
	
	private Integer quantity;
	
	private Double productTotal;
	
	private Double amount;
	
	private Double exchangeScore;
	
	private String requirement;
	
	private String remark;
	
	private Integer orderPayId;
	
	private Integer orderDeliveryId;
	
	private Date createTime;
	
	private String updateAccount;
	
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getCarry() {
		return carry;
	}

	public void setCarry(String carry) {
		this.carry = carry;
	}

	public Double getCarryFeeTotal() {
		return carryFeeTotal;
	}

	public void setCarryFeeTotal(Double carryFeeTotal) {
		this.carryFeeTotal = carryFeeTotal;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getProductTotal() {
		return productTotal;
	}

	public void setProductTotal(Double productTotal) {
		this.productTotal = productTotal;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getExchangeScore() {
		return exchangeScore;
	}

	public void setExchangeScore(Double exchangeScore) {
		this.exchangeScore = exchangeScore;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrderPayId() {
		return orderPayId;
	}

	public void setOrderPayId(Integer orderPayId) {
		this.orderPayId = orderPayId;
	}

	public Integer getOrderDeliveryId() {
		return orderDeliveryId;
	}

	public void setOrderDeliveryId(Integer orderDeliveryId) {
		this.orderDeliveryId = orderDeliveryId;
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
