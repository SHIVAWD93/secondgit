package com.techno.CrudOperation.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techno.CrudOperation.customeException.BussinessException;
import com.techno.CrudOperation.entity.Employee;
import com.techno.CrudOperation.repository.EmployeRepo;

@Service
public class EmployeService {

	@Autowired
	private EmployeRepo repo;
	
	public List<Employee> getAllEmploye() {
	return (List<Employee>) repo.findAll();	
	}

	public Employee  insertEmp(Employee employe) {
		if(employe != null) {
			return	repo.save(employe);
		}
		return null;
	}
	
	public Employee getEmpById(long id) {
		try {
			Optional<Employee>  emp = repo.findById(id);
			Employee emp1 = emp.get();
			return emp1;
		}
	catch (NoSuchElementException e) {
		throw new BussinessException("601", "Given Id is not Present In the Database");
	}
		}

}
