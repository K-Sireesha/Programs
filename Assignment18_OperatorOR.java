package practicejan15;
//Logical OR Operator - All conditions check
public class Assignment18_OperatorOR 
{	static void person(int age,String gender)
	{
		if(age>=18||gender=="Female")
		{
			System.out.println("Job Holder");
		}
		if(age>=18||gender=="male")
		{
			System.out.println("Student");
		}
		if(age>18||gender=="Female")
		{
			System.out.println("Child");
		}
		if(age<18||gender=="male")
		{
			System.out.println("Just Born");
		}
	}		
	public static void main(String[] args) 
	{
		person(18,"Female");
	}}
