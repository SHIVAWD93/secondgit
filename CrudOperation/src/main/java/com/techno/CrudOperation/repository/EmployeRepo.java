package com.techno.CrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techno.CrudOperation.entity.Employee;
@Repository
public interface EmployeRepo extends JpaRepository<Employee, Long> {

}
