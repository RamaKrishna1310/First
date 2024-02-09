package com.practice;

class Super {
	Super() {
		System.out.println("This is Super class constructor");
	}
	public void getInfo() {
		System.out.println("This is Super class method");
	}
}

class Sub extends Super {
	Sub() {
		super();
		System.out.println("This is Sub class constructor");
	}
	public void displayInfo() {
		super.getInfo();
		System.out.println("This is Sub class method");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.displayInfo();
	}
}
