package com.gm.entity.message;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 私人通知表实体
 * @author MC
 * @date 2017-6-7
 */
@TableName("gm_private_notice")
public class PrivateNoticeDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String account;
	
	private String title;
	
	private String content;
	
	private String notifier;
	
	private Date noticeTime;
	
	private String ifRead;
	
	private Date readTime;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNotifier() {
		return notifier;
	}

	public void setNotifier(String notifier) {
		this.notifier = notifier;
	}

	public Date getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}

	public String getIfRead() {
		return ifRead;
	}

	public void setIfRead(String ifRead) {
		this.ifRead = ifRead;
	}

	public Date getReadTime() {
		return readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}
	
}
