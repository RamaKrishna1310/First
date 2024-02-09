import java.util.Scanner;

public class PolyDemo {

		public void calCulate()
		{
			System.out.println("Please pass the values to calculate");
		}
		public void calCulate(int a)
		{
			System.out.println("The area of the Square is: "+(a*a));
		}
		public void calCulate(int a, int b, int c)
		{
			System.out.println("The perimeter of the Triangle is : " +(a+b+c));
		}
		public void calCulate(int l, int b)
		{
			System.out.println("The Perimeter of the Rectangle is :" +(2*(l+b)));
			System.out.println("The Area of the Rectangle is : " +(l*b));
			
		}
		public static void main(String [] args)
		{
			PolyDemo p = new PolyDemo();
			int a,b,c;
			Scanner s =new Scanner(System.in);
			System.out.println("Please enter 'a','b','c', Values :" );
			a= s.nextInt();
			b= s.nextInt();
			c = s.nextInt();
			p.calCulate(a);
			p.calCulate(a,b);
			p.calCulate(a,b,c);
			
			
		}
		
}
