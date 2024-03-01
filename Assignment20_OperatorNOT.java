package practicejan15;
//Logical NOT Operator - All conditions check
public class Assignment20_OperatorNOT 
{
	static void voting(int a)
	{
		if(!(a>=18))
		{
			System.out.println("Person is Minor");
		}
		else
		{
			System.out.println("Person is Major");
		}
	}
	
	public static void main(String[] args) 
	{
		voting(18);
		//voting(17);
	}

}
