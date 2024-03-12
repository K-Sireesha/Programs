package programs_experiment;
import java.util.Arrays;
import java.util.Date;
public class String_SpecialCharCheck_Exp 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d.getTime());	
		Date d1=new Date(d.getTime());
		System.out.println(d1);		
		String d2=d1.toString();
		System.out.println(d2);
		//String d3=d2.substring(0);
		//System.out.println(d3);
		int alphano=0,digitno=0,spaceno=0,charno=0;
		char c1[]= d2.toCharArray();
		for(int i=0;i<d2.length();i++) 
		{
		boolean a=Character.isAlphabetic(c1[i]);
		boolean b=Character.isDigit(c1[i]);
		boolean c=Character.isWhitespace(c1[i]);
		
			if(a==true)
			{
				alphano++;
			} else if(b==true)
			{
				digitno++;
			} else if(c==true)
			{
				spaceno++;
			}else
			{
				charno++;
			System.out.println("String has Special Character "+ c1[i]+" at the index "+i);
			}
			
		}	
	System.out.println("Current Date And Time is "+d2+" which has  "+alphano+" alphabets in it");
	System.out.println("Current Date And Time is "+d2+" which has  "+digitno+" digits in it");
	System.out.println("Current Date And Time is "+d2+" which has  "+spaceno+" spaces in it");
	System.out.println("Current Date And Time is "+d2+" which has  "+charno+" special chars in it"); 
	
	/*int d4=d3.length()-(alphano+digitno+spaceno);
	if(d4>0)
	{
		System.out.println("String has special characters in it");
		System.out.println("No of special characters in String is "+d4);
	}
	else
	{
	System.out.println("String has no special characters in it");	
	}*/
	
	}
}
