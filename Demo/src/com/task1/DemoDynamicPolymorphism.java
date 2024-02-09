package com.task1;


/**
 * Dynamic Polymorphism(late binding) or runtime polymorphism
 * Example: Method Overriding
 */

class Test {
	void t() {
		System.out.println("This method is from parent class Test");
	}
}

class Test1 extends Test {
	void t() {
		super.t(); 
		System.out.println("This method is from child class Test");
	}
}


public class DemoDynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test1 = new Test1();
		test1.t();
		Test t1 = new Test1();
		Test t2 = new Test1();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
	}

}
