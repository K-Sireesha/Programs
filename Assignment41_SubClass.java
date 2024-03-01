package practicejfeb21;
//Upcasting and Downcasting
class Superclass4
{
	void add2()
	{
		int a=10,b=20;
		System.out.println("Addition "+(a+b));//30
	}
}

class Superclass3 extends Superclass4
{
	void add1()
	{
		int a=100,b=200;
		System.out.println("Sum "+(a+b));//300
	}	
}
public class Assignment41_SubClass extends Superclass3
{
	void add()
	{
		int a=1000,b=2000;
		System.out.println("Adding "+(a+b));//3000
	}
	public static void main(String[] args) 
	{
		Superclass3 s3= new Assignment41_SubClass(); //upcasting
		s3.add1();
		s3.add2();
		
		Superclass4 s4= new Assignment41_SubClass(); //upcasting
		s4.add2();
		
		Assignment41_SubClass a1= (Assignment41_SubClass) s4; //downcasting
		a1.add();
		a1.add1();
		a1.add2();
	}
}
