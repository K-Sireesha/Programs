package practicejan09;
//Circumference of Rectangle,Square and Circle
public class Assignment12_Circumference
{  	static void rectangle()
	{
		int a=12,b=3,c;
		c=2*(a+b);
		System.out.println("Circumference of Rectangle is");
		System.out.println(c);
	}
	static void square()
	{
		int c,b=3;
		c=4*b;
		System.out.println("Circumference of Square is");
		System.out.println(c);
	}
	void circle()
	{
		int a=21; double c;
		c=2*3.14*a;
		System.out.println("Circumference of Circle is");
		System.out.println(c);
	}
	void triangle()
	{
		int a=4,b=5,c=7;
		int d=a+b+c;
		System.out.println("Circumference of Triangle is");
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Assignment12_Circumference a1= new Assignment12_Circumference();
		a1.circle();
		a1.triangle();
		rectangle();
		square();
	}}
