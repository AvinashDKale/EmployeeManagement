package com.em.employee.service;

import java.util.List;

import com.em.employee.entity.Employee;

public interface EmployeeServiceInterface {

	public List<Employee> findAllEmployee();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	public List<Employee> getByKeyword(String keyword);
}
