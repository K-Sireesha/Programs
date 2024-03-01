package practicejan17;
//print numbers from 1 to 500,respective conditions divisible by 3,5, 3&5 should be printed 
public class Assignment22_Divisible 
{
	static void div(int a)
		{
			for(int i=1;i<=a;i++)
			{
				System.out.println(i);		
				if(i%3==0)
					{
					System.out.println("Computer");
					}
				if(i%5==0)
					{
						System.out.println("Mouse");
					}
				if(i%3==0 && i%5==0)
					{
					System.out.println("Computer & Mouse");
					}	
			}
		}
		public static void main(String[] args) 
		{
			div(500);
		}
	}

