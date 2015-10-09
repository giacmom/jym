package com.jym.entity;

public class ResponseMessage {
	private int status;					// 状态码 
	private String message;				// 响应的消息(对status的描述)
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
