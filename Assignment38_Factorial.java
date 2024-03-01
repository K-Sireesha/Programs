package practicejfeb09;
//Assignment_Factorial
import java.util.Scanner;
public class Assignment38_Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s1.nextInt();
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;	
		}
		System.out.println(f);
	}

}
