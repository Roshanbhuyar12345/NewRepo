package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Employee {
	@Id
	private int emp_id;
	private String e_name;
	@ManyToMany
	private List<Projects> project;
	public Employee(int emp_id, String e_name, List<Projects> project) {
		super();
		this.emp_id = emp_id;
		this.e_name = e_name;
		this.project = project;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public List<Projects> getProject() {
		return project;
	}
	public void setProject(List<Projects> project) {
		this.project = project;
	}
	
	

}
