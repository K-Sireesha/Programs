package practicejan17;
//Even numbers using i++ operator 2 times
public class Assignment21_Forloop 
{
	static void even()
	{
		for(int i=0;i<=100;i+=2)
		{
			if(i%2==0)
				System.out.println("Even Number "+i);
		}		
	}
	static void odd()
	{
		for(int i=1;i<100;i+=2)
		{
			if(i%2!=0)
				System.out.println("Odd Number "+i);
		}		
	}
	public static void main(String[] args) 
	{
		even();
		//odd();
	}

}
