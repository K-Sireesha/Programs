package practicejan19;
//Print numbers from 1 to 100 by using scanner class
import java.util.*;
public class Assignment28_forloop1to100 
{
	static void number(int a)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value 1");
		int min = s1.nextInt();
		System.out.println("Enter value 2");
		int max = s1.nextInt();
		/*for(int b=min;b<=max;b++)
		{
			System.out.println(b);
		}*/
		for(int b=-min;b>-max-1;b--)
		{
			System.out.println(-b);
		}
	}
	public static void main(String[] args) 
	{
		number(4);
	}
}
