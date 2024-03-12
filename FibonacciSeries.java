package programs_experiment;
import java.util.Scanner;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int x=0,y=1;
		for(int i=0;i<=a;i++)
		{
			System.out.print(x+ " ");
			int sum=x+y;
			x=y;
			y=sum;	
		}		
	}
}
