package practicejan17;
//Area of circle using pi as global final variable
public class Assignment23_Finalvariable 
{
	final double pi=3.14;
	static void area(int r)
	{		
		Assignment23_Finalvariable a1= new Assignment23_Finalvariable();
		double circle=a1.pi*r*r;
		System.out.println(circle);		
	}
	
	public static void main(String[] args) 
	{
		area(15);		
	}
}
