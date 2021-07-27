package com.shaunmelville.poc.base.persistence.dao;

public class BaseResponseDto {
	
	private boolean success;
	private String message;
	private String suggestion;
	
	public BaseResponseDto() {
	}
	
	public BaseResponseDto(boolean success, String message, String suggestion) {
		super();
		this.success = success;
		this.message = message;
		this.suggestion = suggestion;
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	
}
