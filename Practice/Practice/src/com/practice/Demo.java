package com.practice;
class Demo2 {
	 public void showinfo()
		{
			System.out.println("this is an example");
			
		}

}

class Child1 extends Demo2
{
	 
}


public class Demo {
		public static void main(String args[])
		
		{
			Child1 c = new Child1();
			
			c.showinfo();
		}
}
  