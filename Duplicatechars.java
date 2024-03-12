package programs_experiment;
import java.util.Arrays;
import java.util.Scanner;
public class Duplicatechars 
{
	Scanner s1=new Scanner(System.in);
	String a=s1.next();
	static void Duplicate()
	{
		String a1="Sushma";int count;
		System.out.println(a1.length());
		String a2= a1.toLowerCase();
		System.out.println(a2);
		char c[]=a2.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<=a2.length()-1;i++)
		{	
			count=1;
			for(int j=i+1;j<=a2.length()-1;j++)
			{
				if((c[i] == c[j]) && (c[i]!=' '))
				{
					count++;
					c[j]='0';		
				}
			}			
			if(count > 1 && c[i] != '0')    
	        {
			System.out.println(c[i]+" Index is at"+ i);
				
	        }
			
		}
		
	}
	public static void main(String[] args) 
	{
		Duplicate();
	}

}
