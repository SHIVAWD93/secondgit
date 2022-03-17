package com.techno.CrudOperation.customeException;

import org.springframework.stereotype.Component;

@Component
public class BussinessException extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String errorode;
private String errorMsg;
public BussinessException(String errorode, String errorMsg) {
	super();
	this.errorode = errorode;
	this.errorMsg = errorMsg;
}
public String getErrorode() {
	return errorode;
}
public void setErrorode(String errorode) {
	this.errorode = errorode;
}
public String getErrorMsg() {
	return errorMsg;
}
public void setErrorMsg(String errorMsg) {
	this.errorMsg = errorMsg;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public BussinessException() {
	super();
}


}
