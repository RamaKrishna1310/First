package com.practice;

class Key1 {
	final int a = 10;//it is always constant we cant change
	void displayInfo()
	{
		System.out.println("a value is ="+a);
	}
	void showInfo() {
		System.out.println("This is Final Method");
	}
}
class Test1 extends Key1{
	final void showInfo() {
		System.out.println("This is Final Method");
	}

}
public class Demo1
{
	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.displayInfo();
		t.showInfo();
	}
}