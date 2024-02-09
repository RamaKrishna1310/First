package com.practice;

class Student {
	int stdId;
	java.lang.String stdName;
	java.lang.String stdAddress;

	Student() {
		System.out.println("This is default Constructor");
	}

	Student(int stdId, java.lang.String stdName, java.lang.String stdAddress) {
		this();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}

	public void resultInfo() {
		System.out.println(this.stdId + " " + this.stdName + " " + this.stdAddress);
	}

	public void displayInfo() {
		this.resultInfo();
	}
}

public class ParameterisedConstructor {

	public static void main(java.lang.String[] args) {

		Student s = new Student(101, "Rama", "Hyderabad");
//		s.resultInfo();
		s.displayInfo();
//		s.stdId=102;
//		s.displayInfo();
//		new Student();
		System.out.println(new Student());
		System.out.println(new Student());

	}

}
