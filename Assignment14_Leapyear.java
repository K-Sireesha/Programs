package practicejan10;
//Check the given is leap year or not
public class Assignment14_Leapyear 
{
	public static void main(String[] args) 
	{
		testLeapYear(2024);
		testLeapYear(2027);		
	}
	 static void testLeapYear(int year)
	{
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
		System.out.println("Year 2024 is a Leap Year");
		}
		else
		{
		System.out.println("Year 2027 is NOT a Leap Year");
		}
	}
}

  
