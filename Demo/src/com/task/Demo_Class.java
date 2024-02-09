package com.task;

public class Demo_Class {
	public static void main(String[] args)
	{
		Employee e1= new Employee();//object Creation
		e1.setEmpId(1001);
		e1.setEmpName("RamaKrishna");
		e1.setEmpAddress("Telangana");
		System.out.println(e1.getEmpId()+"\n "+e1.getEmpName()+" \n"+e1.getEmpAddress());
		Department d1 = new Department(); //object
		d1.setDeptId(002);
		d1.setDeptName("RamaKrishna");
		d1.setDeptAddress("Hyderbad");
		System.out.println(d1.getDeptId()+" \n" + d1.getDeptName()+" \n" + d1.getDeptAddress());
		e1.displayInfo();
	}

}
