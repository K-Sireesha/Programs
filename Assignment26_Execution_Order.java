package practicejan18;
//Execution Order for SIB,Main Method,IIB and Parameterized Constructors
public class Assignment26_Execution_Order 
{
	static
	{
		System.out.println("SIB Block");
	}
	
	{
		System.out.println("This is a IIB Block");
	}
	
	Assignment26_Execution_Order(int a)
	{
		System.out.println("When multiple constructors exists, the order of constructors execution will be line by line code written in main method");
	}
	Assignment26_Execution_Order(int a,char c)
	{
		System.out.println("IIB block will be executed every time before each and every constructor being invoked");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		//Assignment26_Execution_Order a1 = new Assignment26_Execution_Order(10);
		new Assignment26_Execution_Order(112,'c');
		new Assignment26_Execution_Order(14);	
	}
}
