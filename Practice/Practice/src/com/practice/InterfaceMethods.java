package com.practice;

interface I {
	static void i() {
		System.out.println("This is static method of I interface");
	}
}

class C implements I {
	static void i() {
		System.out.println("This is static method of C class ");
	}
}

public class InterfaceMethods {
	public static void main(String[] args) {
		I.i();
		C.i();
		
	}
}