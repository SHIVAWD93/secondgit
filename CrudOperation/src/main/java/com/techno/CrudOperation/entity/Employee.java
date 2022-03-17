package com.techno.CrudOperation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Emp")
@Data
public class Employee  implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
  @Column(name = "EmployeName")
	private String name;
	
}
