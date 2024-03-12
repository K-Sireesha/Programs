package programs_experiment;

import java.util.Scanner;

public class Forloop 
{
	public static void num(int a)
	{
	int max=a;
	for(int min=1;min<max;min++)
	{
		System.out.println(min);
	}
	}
	public static void num1(int a)
	{
		int max=a;
		for(int min=1;min<=max;min++)
		{
			System.out.println(min);
		}
	}
	public static void num2(int a)
	{
		int max=a;
		for(int min=1;min!=max;min++)
		{
			System.out.println(min);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s1.nextInt();
		num(a);
		s1.close();
			
	}
	
	/*static void num(int a)
	{
	int max=a;
	for(int min=1000;min>=max;min--)
	{
		System.out.println(min);
	}
	}
	static void num1(int a)
	{
	int max=a;
	for(int min=1000;min!=max;min--)
	{
		System.out.println(min);
	}
	}
	static void num2(int a)
	{
	int max=a;
	for(int min=1000;min>max;min--)
	{
		System.out.println(min);
	}
	}
KT Session FOR loop using scanner class	
	static void looping(int a)
	{
		int min=1000;	
		for(int max=a;min<=max;max--)
		{
			System.out.println(max);
		}
		
	for(int max=a;min<max;max--)
		{
			System.out.println(max);
		}
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();
	looping(a);*/
	
	
}
