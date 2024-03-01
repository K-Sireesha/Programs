package practicejan15;
//Logical AND Operator - All conditions check
public class Assignment19_OperatorAND 
{	static void distinction(int percentage,String grade)
	{
		if(percentage>=75 && grade=="A")
		{
			System.out.println("FIRST CLASS");
		}
		if(percentage>=75 && grade=="B")
		{
			System.out.println("SECOND CLASS");
		}
		if(percentage>75 && grade=="A")
		{
			System.out.println("THIRD CLASS");
		}
		if(percentage<75 && grade=="D")
		{
			System.out.println("FOURTHCLASS");
		}
	}		
	public static void main(String[] args) 
	{
		distinction(75,"A");
	}}
