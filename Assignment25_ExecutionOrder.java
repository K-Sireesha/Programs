package practicejan18;
//Execution Order for SIB,Main Method,IIB 
//and Constructor by creating object 2 times
public class Assignment25_ExecutionOrder
{
	static
	{
		System.out.println("SIB Block");
	}
	
	{
		System.out.println("This is a IIB Block");
	}
	
	Assignment25_ExecutionOrder()
	{
		System.out.println("Here the order of execution is SIB, Main Method, IIB & Constructors");
	}
	Assignment25_ExecutionOrder(int a)
	{
		System.out.println("When parameterized and non-parameterized constructors exists, the order of constructors execution will be line by line code written in main method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new Assignment25_ExecutionOrder();
	Assignment25_ExecutionOrder a1 = new Assignment25_ExecutionOrder();
		//new Assignment25_ExecutionOrder(14);
	//Assignment25_ExecutionOrder a1 = new Assignment25_ExecutionOrder(10);	
	}

}
