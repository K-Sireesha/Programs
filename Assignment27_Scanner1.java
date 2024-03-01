package practicejan19;
//main method with 4 different methods using object for scanner class
//with global variables
import java.util.Scanner;
public class Assignment27_Scanner 
{
	Scanner s1= new Scanner(System.in);
	{
		System.out.println("Enter value 1");
	}
		int no1 = s1.nextInt();
	{
		System.out.println("Enter value 2");
	}
		int no2 = s1.nextInt();	
	void add()
	{
		int sum=no1+no2;
		System.out.println("Sum of 2 numbers "+sum);
	}
	void sub()
	{
		int sub=no1-no2;
		System.out.println("Subtraction of 2 numbers "+sub);
	}
	void mul()
	{
		int mul=no1*no2;
		System.out.println("Multiplication of 2 numbers "+mul);
	}
	void div()
	{
		double div=no1/no2;
		System.out.println("Division of 2 numbers "+div);
	}
	public static void main(String[] args) 
	{
		Assignment27_Scanner a1= new Assignment27_Scanner();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}
}
