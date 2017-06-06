package com.gm.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 客户商品收藏表实体
 * @author MC
 * @date 2017-6-6
 */
@TableName("gm_account_favorite_product")
public class AccountFavoriteProductDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Integer accountId;
	
	private Integer productId;
	
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
