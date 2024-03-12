package practicejfeb06;
import java.util.*;
public class AssignmentPalindrome 
{
	public static void main(String[] args)
	{	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String value");
		String i=s1.next();
		String j="";
		for(int a=i.length()-1;a>=0;a--)
		{
			char c=i.charAt(a);
			j=j+c;	
		}
		System.out.println(j);
		
		if(i.equalsIgnoreCase(j))
		{
			System.out.print("Strings are Palindrome");
		}
		
	}
		
}

