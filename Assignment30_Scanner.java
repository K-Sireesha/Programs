package practicejan19;
//main method with 4 different methods using object for scanner class 4 times
import java.util.Scanner;
public class Assignment30_Scanner 
{
	void add()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value 1");
			int no1 = s1.nextInt();
		System.out.println("Enter value 2");
			int	no2 = s1.nextInt();
			int sum=no1+no2;
		System.out.println("Sum of 2 numbers "+sum);
	}
	void sub()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value 1");
			int no1 = s1.nextInt();
		System.out.println("Enter value 2");
			int	no2 = s1.nextInt();
			int sub=no1-no2;
		System.out.println("Subtraction of 2 numbers "+sub);
	}
	void mul()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value 1");
			int no1 = s1.nextInt();
		System.out.println("Enter value 2");
			int	no2 = s1.nextInt();
			int mul=no1*no2;
		System.out.println("Multiplication of 2 numbers "+mul);
	}
	void div()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value 1");
			int no1 = s1.nextInt();
		System.out.println("Enter value 2");
			int	no2 = s1.nextInt();
			double div=no1/no2;
		System.out.println("Division of 2 numbers "+div);
	}
	public static void main(String[] args) 
	{
		Assignment30_Scanner a1= new Assignment30_Scanner();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}
}
