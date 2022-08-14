package com.em.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empdetails_table")
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int id;
	
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="phoneNo")
	private int phoneNo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="company")
	private String company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", phoneNo=" + phoneNo + ", address=" + address + ", salary="
				+ salary + ", company=" + company + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String ename, int phoneNo, String address, int salary, String company) {
		super();
		this.id = id;
		this.ename = ename;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
		this.company = company;
	}
	







}

