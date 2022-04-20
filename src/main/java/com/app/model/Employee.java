package com.app.model;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, double sal) {
		this.eid=id;
		this.ename=name;
		this.esal=sal;
	}
	public void setEid(int id) {
		this.eid=id;
	}
	public void setEname(String name) {
		this.ename=name;
	}
	public void setEsal(double sal) {
		this.esal=sal;
	}
	public int getEid() {
		return this.eid;
	}
	public String getEname() {
		return this.ename;
	}
	public double getEsal() {
		return this.esal;
	}
	public String toString() {
		return "Employee[eid="+this.eid+", ename="+this.ename+", esal="+this.esal+
				"]";
	}

}
