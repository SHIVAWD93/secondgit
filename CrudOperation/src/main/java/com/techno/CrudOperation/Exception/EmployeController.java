package com.techno.CrudOperation.Exception;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techno.CrudOperation.customeException.BussinessException;
import com.techno.CrudOperation.customeException.ControllerException;
import com.techno.CrudOperation.entity.EmpResponse;
import com.techno.CrudOperation.entity.Employee;
import com.techno.CrudOperation.repository.EmployeRepo;
import com.techno.CrudOperation.service.EmployeService;

@RestController
@RequestMapping(path = "/emp")
public class EmployeController {
	
	@Autowired
	private EmployeService service;
	
@PostMapping("/addEmp")
public ResponseEntity<Employee> insertEmp(@RequestBody Employee employe){
	if(	service.insertEmp(employe)!=null) {
		return new  ResponseEntity<Employee>(service.insertEmp(employe),HttpStatus.CREATED);
	}
	return null;
}

@GetMapping("/allEmp")
public List<Employee> getAllEmploye(){
return 	service.getAllEmploye();	
}
@GetMapping("{id}")
public ResponseEntity<?> getEmployeId(@PathVariable("id") long empId){
	try {
		 Employee emp=  service.getEmpById(empId);
 return new ResponseEntity<Employee>(emp, HttpStatus.FOUND);
	}catch (BussinessException e) {
ControllerException ce = new ControllerException(e.getErrorode(), e.getErrorMsg());
return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
	}
	catch (ControllerException e) {
ControllerException ce = new ControllerException("602", "SomeThing Went Wrong In Controller Layer");
 return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
	}
	 
}


}
