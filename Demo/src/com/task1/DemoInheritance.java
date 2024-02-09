package com.task1;
class Parent{
	int id=101;
	public void displayInfo()
	{
		System.out.println("This is Parent class method");
	}
	
}
class Child extends Parent{
	public void getInfo()
	{
		System.out.println("This is Child class Method");
	}
	
}
public class DemoInheritance {
	public static void main(String[] args)
	{
		Child c=new Child();
		c.displayInfo();
		//p.getInfo(); child class method cannot accesed by parent class method
	}

}
