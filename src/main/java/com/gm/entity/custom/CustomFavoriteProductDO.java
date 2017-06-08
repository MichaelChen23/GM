package com.gm.entity.custom;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 客户商品收藏表实体
 * @author MC
 * @date 2017-6-6
 */
@TableName("gm_custom_favorite_product")
public class CustomFavoriteProductDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Integer customId;
	
	private Integer productId;
	
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomId() {
		return customId;
	}

	public void setCustomId(Integer customId) {
		this.customId = customId;
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
