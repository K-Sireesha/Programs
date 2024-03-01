package practicejan10;
//Check given number is positive or negative
public class Assignment15_if
{
	static void number(int a)
	{
	if(a>0)
	{
	System.out.println(a+" is a Positive number");	
	}
	if(a<0)
	{
	System.out.println(a+" is a Negative number");	
	}
	}	
	public static void main(String[] args) 
	{
		number(45);
		number(-45);
	}
}
