package practicejfeb09;
//Assignment_check if a string contains digits
import java.util.Arrays;
public class Assignment37_NumberCheck 
{
	public static void main(String[] args) 
	{
		String a="303FortuneAvenue";
		String a1="9802380543"; int noofchar=0,noofint=0;
		//char c[]=a.toCharArray();
		//System.out.println(Arrays.toString(c));
		char c1[]=a1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=a1.length()-1;i>=0;i--)
		{
			boolean a2=Character.isAlphabetic(c1[i]);
			if(a2==true)
			{noofchar++;}
			else
			{noofint++;}
		}
		System.out.println("No of chars "+noofchar);
		System.out.println("No of digits "+noofint);
		if(noofchar>0)
		{
			System.out.println("String is not made of only numeric");
		}
		else
		{
			System.out.println("String consists only digits");
		}
		
		/*
		String a="43549844";
		char c[]=a.toCharArray();int noofdigits=0,noofalpha=0;
				for(int i=0;i<=a.length()-1;i++)
				{
				boolean a1=Character.isDigit(c[i]);
					if(a1==true)
					{noofdigits++;}
					else
					{noofalpha++;}
				}
				System.out.println("No of digits in a string "+noofdigits);
				System.out.println("No of alphabets in a string "+noofalpha);
				if(noofalpha>0)
				{System.out.println("String has alphabets");}
				else
				{System.out.println("String has only digits");}*/

	}

}




