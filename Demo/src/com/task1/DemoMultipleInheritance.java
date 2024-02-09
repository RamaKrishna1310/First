package com.task1;

interface Super1 {
	void s1();
}

interface Super2 {
	void s2();
}

class Sub implements Super1, Super2 {
	
	public void s1() {
		System.out.println("This is s1 method");
	}
	
	public void s2() {
		System.out.println("This is s2 method");
	}
}


public class DemoMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.s1();
		s.s2();
	}

}
