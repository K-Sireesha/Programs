package practicejan11;
//Multiple if blocks inside if conditional statement
public class Assignment16_Multiple_Ifs 
{	Assignment16_Multiple_Ifs(int a)
	{if(a>=1&&a<200)
		{
		if(a>=60)
		{
			System.out.println("Person is Senior Citizen");
		}
		if(a>18&&a<60)
		{
			System.out.println("Person is Adult");
		}
		if(a<=18&&a>12)
		{
			System.out.println("Person is Teenager");
		}
		if(a<=12&&a>5)
		{
			System.out.println("Growing Kid");
		}
		if(a>2&&a<=5)
		{
			System.out.println("Toddler");
		}
		if(a<=2)
		{
			System.out.println("Baby");
		}
		}
		else 
		{
			System.out.println("Just Born");	
		}}	
	public static void main(String[] args) 
	{
		new Assignment16_Multiple_Ifs(10);
	}}
