package com.gm.common;

import java.io.Serializable;

/**
 * 基础返回类
 * @author MC
 * @date 2017-5-31
 * @param <T>
 */
public class BaseResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	//返回编码
	private String code;
	
	//返回消息
	private String msg;
	
	//返回实体
	private T t;
	
	public BaseResponse(){}

	public BaseResponse(String code, String msg, T t) {
		super();
		this.code = code;
		this.msg = msg;
		this.t = t;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
