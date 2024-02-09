/**
 * 
 */
package com.task1;

/**
 * Static polymorphism(early binding) or compile time polymorphism.
 * Example: Method Overloading
 */
public class DemoStaticPolymorphism {

	public void calculate() {
		System.out.println("This method without any parameters");
	}
	
	public void calculate(int n) {
		System.out.println("Area of square is = "+(n*n));
	}
	
	public void  calculate(int l, int b) {
		System.out.println("Area of the Rectangle is = "+(l*b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStaticPolymorphism p = new DemoStaticPolymorphism();
		p.calculate();
		p.calculate(5);
		p.calculate(4, 5);
	}

}
