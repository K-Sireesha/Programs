package practicejfeb06;
//Input boolean values and form an array
import java.util.Arrays;
import java.util.Scanner;
public class Assignment_Boolean 
{
	public static void main(String[] args) 
	{
		boolean a[]=new boolean[3]; 
		Scanner b= new Scanner(System.in);
		for (int i=0;i<=2;i++)
		{
			System.out.println("Enter boolean value "+(i+1));
			a[i]=b.nextBoolean();
		}
		System.out.println(Arrays.toString(a));
	}

}
