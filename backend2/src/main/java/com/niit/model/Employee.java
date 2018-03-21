package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_s180250")
public class Employee {
	@Id  //unique and not null
	@GeneratedValue(strategy=GenerationType.AUTO)
private String eid;
private String ename;
private String department;
private int dob;
private String salary;
public String getEid() {
	return eid;
}
public void setEid(String string) {
	this.eid = string;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getDob() {
	return dob;
}
public void setDob(int i) {
	this.dob = i;
}
public String getSalary() {
	return salary;
}
public void setSalary(String string) {
	this.salary = string;
}
}
