package com.techno.CrudOperation.customeException;

import org.springframework.stereotype.Component;

@Component
public class ControllerException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errrorMsg;
	public ControllerException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ControllerException(String errorCode, String errrorMsg) {
		super();
		this.errorCode = errorCode;
		this.errrorMsg = errrorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrrorMsg() {
		return errrorMsg;
	}
	public void setErrrorMsg(String errrorMsg) {
		this.errrorMsg = errrorMsg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
