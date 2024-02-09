package com.task;
//POJO class(plain old java object)

public class Employee {
	private int empId;//data members or field
	private String empName;
	private String empAddress;
	//getter method is used for get the value
	public int getEmpId() {
		return empId;
	}
	//setter method is used to set the values..
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public void displayInfo()
	{
		this.empId=101;
		this.empName="Rama";
		this.empAddress="Hyderbad";
		System.out.println(empId+" "+ empName+" "+ empAddress);
	}
	
	
}
