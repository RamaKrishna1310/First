package com.task1;

class Parent1{
	public void displayInfo()
	{
		System.out.println("This is Parent class method");
	}
	
}
class Child1 extends Parent{
	public void getInfo()
	{
		System.out.println("This is Child class Method");
	}
	
}
class GrandChild1 extends Child{
	public void showInfo() {
		System.out.println("this is Grand Child Class Methiod");
	}
}
public class DemoInheritance1 {
	public static void main(String[] args)
	{
		GrandChild1 g=new GrandChild1();
		g.displayInfo();
		g.getInfo();
		g.showInfo();
		//p.getInfo(); child class method cannot accesed by parent class method
	}

}

