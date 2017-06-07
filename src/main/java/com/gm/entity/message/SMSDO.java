package com.gm.entity.message;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 短信表实体
 * @author MC
 * @date 2017-6-7
 */
@TableName("gm_sms")
public class SMSDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String mobile;
	
	private String content;
	
	private Date sendTime;
	
	private String type;
	
	private String smsReturnCode;
	
	private String resultCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSmsReturnCode() {
		return smsReturnCode;
	}

	public void setSmsReturnCode(String smsReturnCode) {
		this.smsReturnCode = smsReturnCode;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

}
