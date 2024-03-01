package practicejan02;
//calling both static and non-static methods
public class Assignment01_Methods 
{
	public static void day1()
	{
	System.out.println("Introduction to Selenium");	
	}
	public static void day2()
	{
	System.out.println("Eclipse Installation");	
	}
	protected void day3_4()//non static method
	{
		System.out.println("Program and Main Method");
	}
	void day5()//non static method
	{
		System.out.println("How Java Internally Works?");
	}	
	public static void main(String[] args)
	{
		System.out.println("Calling both static and non-static methods");
		day1();
		day2();
		Assignment01_Methods  a= new Assignment01_Methods();
		a.day3_4();
		a.day5();
	}
}
