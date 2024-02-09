package com.task1;


interface Parent3
{
	void m1();
}

interface Parent2
{
	void m2();
}

class Child2 implements Parent3, Parent2{
	
public void m2() {
	System.out.println("Implemented m2 Method");
	}

public void m1() {
	System.out.println("Implemented m1 Method");	
	}
}

public class DemoInher3 {
	public static void main(String args[]) {
		Child2 c2 = new Child2();
		c2.m1();
		c2.m2();
	}
	
}


