package programs_experiment;
import java.util.Scanner;
//String reversal in multiple ways
public class Stringreverse
{
static void String_reverse()
{
Scanner s1=new Scanner(System.in);
String a= s1.next(); 
String b="";
for(int i=a.length()-1;i>=0;i--)
{
	char c=a.charAt(i);
	 b=b+c;
}
	System.out.println(b);
}
	public static void main(String[] args) 
	{	
		String_reverse();
		
		String a="Arjuna"; //Way 1
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char c=a.charAt(i);
			b=b+c;
		}
		System.out.println(b); //Here the datatype of output is String
		
	
		String c="Subathra";//Way 2
		for(int j=c.length()-1;j>=0;j--)
		{
			char d=c.charAt(j);
			//System.out.print(d); //Prints in single line//Output datatype char
	System.out.println(d); //-Prints each in new line - vertical fashion
		}
		
		String str="Abhimanyu";//Way 3
		StringBuffer s1=new StringBuffer(c);
		s1.reverse();
		System.out.println(s1);
		
		
		
		
	}
}
