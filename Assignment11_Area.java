package practicejan09;
//Area of Rectangle, Triangle, Square, Circle
public class Assignment11_Area 
{
	static void rectangle()
	{
		int a=12;int b=3;
		int c;
		c=a*b;
		System.out.println("Area of Rectangle is");
		System.out.println(c);
	}
	static void square()
	{
		int a=3;int b=3;
		int c;
		c=a*b;
		System.out.println("Area of Square is");
		System.out.println(c);
	}
	void triangle()
	{
		int a=3;int b=12;
		int c;
		c=(a*b)/2;
		System.out.println("Area of Triangle is");
		System.out.println(c);
		//double c
		//c=0.5*a*b; 
	}
	void circle()
	{
		int a=7;
		double c;
		c=(3.14*a*a);
		System.out.println("Area of Cirle is");
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Assignment11_Area a1=new Assignment11_Area();
		a1.triangle();
		a1.circle();
		rectangle();
		square();
	}

}
