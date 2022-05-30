package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
private String username;
private String password;
private String employeeid;
private String createddate;
private String department;
private String role;
private String sallery;
private String status;

public Employee(){}
public Employee(String username, String password, String employeeid, String createddate, String department, String role,
		String sallery, String status) {
	super();
	this.username = username;
	this.password = password;
	this.employeeid = employeeid;
	this.createddate = createddate;
	this.department = department;
	this.role = role;
	this.sallery = sallery;
	this.status = status;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(String employeeid) {
	this.employeeid = employeeid;
}
public String getCreateddate() {
	return createddate;
}
public void setCreateddate(String createddate) {
	this.createddate = createddate;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getSallery() {
	return sallery;
}
public void setSallery(String sallery) {
	this.sallery = sallery;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Employee [username=" + username + ", password=" + password + ", employeeid=" + employeeid + ", createddate="
			+ createddate + ", department=" + department + ", role=" + role + ", sallery=" + sallery + ", status="
			+ status + "]";
}

	
}
