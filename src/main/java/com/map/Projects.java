package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	private int p_id;
	private String p_name;
	@ManyToMany
	private List<Employee> emp;
	public Projects(int p_id, String p_name, List<Employee> emp) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.emp = emp;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
	

}
