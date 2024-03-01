package practicejfeb09;
//Checking 2 arrays are equal or not by using sorting
import java.util.Arrays;
import java.util.Scanner;
public class Assignment36_ArrayCheckEqual
{
	public static void main(String[] args) 
	{
		String a[]=new String[3];
		String b[]=new String[a.length];
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{a[i]=s1.next();}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{b[i]=s1.next();}
		System.out.println(Arrays.toString(b));
		Arrays.sort(a);Arrays.sort(b);
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			if(Arrays.equals(a, b)==true)
			{
				System.out.println("Both arrays are equal");
			}
			else 
			{
				System.out.println("Arrays are not equal");
			}
		}
		

	}


