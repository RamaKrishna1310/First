package com.practice;

abstract class Abs {
	void a2() {
		System.out.println("This is a2 method of abstract class");
	}
}

class NonAbs extends Abs {
	
}

public class AbstractClass {

	public static void main(String[] args) {
		NonAbs n = new NonAbs();
		n.a2();
	}

}
