package com.techno.CrudOperation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpResponse {
	
	private String statusCode;
	private String msg;
	private String description;
	private Employee emp;
	
	public EmpResponse(String statusCode, String msg) {
		this.statusCode=statusCode;
		this.msg = msg;
	}

}
