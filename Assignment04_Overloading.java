package practicejan08;
//Constructor Overloading & Method Overloading
public class Assignment04_Overloading
{
	static void method()
	{
		System.out.println("This is static method");
	}
	void method(int a)
	{
		System.out.println("This is non-static method 1");
	}
	void method(double a,char c)
	{
		System.out.println("This is non-static method 2");
	}
	Assignment04_Overloading(double c)
	{
		System.out.println("This is a constructor 1");
	}
	Assignment04_Overloading(int c,String v)
	{
		System.out.println("This is a constructor 2");
	}
	public static void main(String[] args) 
	{
	method();
	new Assignment04_Overloading(12,"Jan 8 2024");
	Assignment04_Overloading a1= new Assignment04_Overloading(45.89);
	a1.method(1234,'d');
	a1.method(5);
	}
}
