package practicejan22assignment;
//Multi Level Inheritance creating 3 classes in a package - City child class
public class Assignment31_City extends Assignment31_State
{
	static void cityname()
	{
		System.out.println("Bangalore");
	}
	static void cityname1()
	{
		System.out.println("Hyderabad");
	}
	public static void main(String[] args) 
	{
		cityname();
		statename();
		countryname();
		cityname1();
		statename1();
		countryname1();

	}

}
