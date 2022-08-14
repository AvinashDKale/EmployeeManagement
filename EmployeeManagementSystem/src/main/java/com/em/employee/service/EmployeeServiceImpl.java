package com.em.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.employee.entity.Employee;
import com.em.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{
	
	@Autowired
	private EmployeeRepository employeerepo;

	@Override
	public void saveEmployee(Employee employee) {
		this.employeerepo.save(employee);
	}
	
	@Override
	public Employee getEmployeeById(int id) {
		return employeerepo.findById(id).get();
		}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		return this.employeerepo.save(employee);
	}
	
	@Override
	public void deleteEmployee(int id) {
		employeerepo.deleteById(id);
	}
	
	@Override
	public List<Employee> findAllEmployee(){
		return  employeerepo.findAll();
	}
	
	@Override
	public List<Employee> getByKeyword(String keyword) {
		return employeerepo.findByKeyword(keyword);
	}
	
	
}
