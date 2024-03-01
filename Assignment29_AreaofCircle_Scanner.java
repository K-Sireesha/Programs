package practicejan19;
//Area of circle using Scanner class using global variable pi
import java.util.Scanner;
public class Assignment29_AreaofCircle_Scanner 
{
	static double pi=3.14;
	static void number(int a)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value 1");
		int r = s1.nextInt();
		double AreaofCircle = pi*r*r;
		System.out.println(AreaofCircle);
	}
	
	public static void main(String[] args) 
	{
		number(14);	
	}
}
