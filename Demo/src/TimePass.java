interface Interface1
{
	void I1();

}
interface Interface2
{
	void I2();
}
interface Child0 extends Interface1, Interface2
{
	void c3();
	public default void I3()
	{
		System.out.println("This is the Part of Default Interface One...");
	}
	public default void I4()
	{
		System.out.println("This is the part of Default Interface Two...");
	}
}

class Child01 implements Child0
{
	public void I1()
	{
		System.out.println("This the first Hybrid Program from I1..");
	}
	public void I2()
	{
		System.out.println("This is the second Hybrid Program from I2");
	}
	public void c3()
	{
		System.out.println("This is the C3 Interface..");
	}
	
}

public class TimePass {
	public static void main(String[] args)
	{
		Child01 c= new Child01(); 
		c.I1();
		c.I2();
		c.c3();
		Child0 c3= new Child01();
		c3.I3();
		c3.I4();
	}

}
