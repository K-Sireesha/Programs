package practicejan10;
//Verify age
public class Assignment13_if_else 
{
	void age(int a)
	{
		if(a>=18)
		{
			System.out.println("Person is a Adult");
		}
		else
		{
			System.out.println("Person is a Teenager");
		}
	}	
	public static void main(String[] args) 
	{
		Assignment13_if_else a1= new Assignment13_if_else();
		a1.age(18);
		a1.age(15);
		a1.age(85);		
	}
}