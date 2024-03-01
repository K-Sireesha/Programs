package practicejan11;
//Nested If-else
public class Assignment17_Nested_If_Else
{
	void gender(String a,int b)
	{
	if(b>60)	
	{
		System.out.println("Senior Citizen");
		{
		if(a=="India")
		{
			System.out.println("Person is an Indian");
		}
		else
		{
			System.out.println("Person is a Foreigner");
		}
	}}
	else
	{
		System.out.println("Youngster");
		if(a!="India")
		{
			System.out.println("Person is not an Indian");
		}
		else
		{
			System.out.println("Person is an Indian");
		}
		
	}}	
	public static void main(String[] args) 
	{	
		Assignment17_Nested_If_Else n1=new Assignment17_Nested_If_Else();
		n1.gender("India",31);
	}
}
