package practicejfeb01;
//Multiple Level Inheritance using 5 interfaces - Global Variables utilization
interface Test1
{ 
	void add();
	int a1=200,b1=300;
}
interface Test2
{
	void sub();
	int a2=200,b2=300;	
}
interface Test3
{
	void mul();
	int a3=20,b3=3;
}
interface Test4
{
	void div();
	int a4=200,b4=600;
}
interface Test5
{
	void mod();
	int a5=200,b5=1000;
}

public class Assignment32_Interface implements Test1,Test2,Test3,Test4,Test5
{
	public static void main(String[] args) 
	{	
		Assignment32_Interface t1=new Assignment32_Interface();
		t1.add();
		t1.sub();
		t1.mul();
		t1.div();
		t1.mod();
	}
	public void mod() 
	{
		int c=b5%a5;
		System.out.println(c);
	}
	public void div() 
	{
		int c=b4/a4;
		System.out.println(c);
	}
	public void mul() 
	{
		int c=b4*a4;
		int c1=b3*a3;
		System.out.println(c);
		System.out.println(c1);
	}
	public void sub() 
	{
		int c=b2-a2;
		System.out.println(c);
	}
	public void add()
	{
		int c=b1+a1;
		int c1=b5+a5;
		System.out.println(c);
		System.out.println(c1);
	}

}
