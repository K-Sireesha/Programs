package practicejan17;
public class Assignment24_MonthdayCalendar
{
	static void year(int b)
	{
		if(!((b%4==0&&b%100==0) || (b%400==0)))
		{
			System.out.println(b+" is a NOT Leap Year");
			
			for(int day=1;day<366;day++)
			{
				if(day>=1 && day<=31)
				{
					System.out.println(+day +" January");
				}
				if(day>=32 && day<=59)
	 			{
	 				System.out.println(+day+" February");		
	 			}	
				if(day>=60 && day<=90)
				{
					System.out.println(+day+" March");		
				}
				if(day>=91 && day<=120)
				{
					System.out.println(+day+" April");		
				}
				if(day>=121 && day<=151)
				{
					System.out.println(+day+" May");		
				}
				if(day>=152 && day<=181)
				{
					System.out.println(+day+" June");		
				}	
				if(day>=182 && day<=212)
				{
					System.out.println(+day+" July");		
				}	
				if(day>=213 && day<=243)
				{
 				System.out.println(+day+" August");		
				}	
				if(day>=244 && day<=273)
				{
 				System.out.println(+day+" September");		
				}	
				if(day>=274 && day<=304)
				{
 				System.out.println(+day+" October");		
				}		
				if(day>=305 && day<=334)
				{
 				System.out.println(+day+" November");		
				}
				if(day>=335 && day<=365)
				{
 				System.out.println(+day+ " December");		
				}
			}
					
		}
		else
		{
			System.out.println(b+" is a Leap Year");
			
			for(int day=1;day<367;day++)
			{
				if(day>=1 && day<=31)
				{
					System.out.println(+day +" January");
				}
				if(day>=32 && day<=60)
	 			{
	 				System.out.println(+day+" February");		
	 			}	
				if(day>=61 && day<=91)
				{
					System.out.println(+day+" March");		
				}
				if(day>=92 && day<=121)
				{
					System.out.println(+day+" April");		
				}
				if(day>=122 && day<=152)
				{
					System.out.println(+day+" May");		
				}
				if(day>=153 && day<=182)
				{
					System.out.println(+day+" June");		
				}	
				if(day>=183 && day<=213)
				{
					System.out.println(+day+" July");		
				}	
				if(day>=214 && day<=244)
				{
 				System.out.println(+day+" August");		
				}	
				if(day>=245 && day<=274)
				{
 				System.out.println(+day+" September");		
				}	
				if(day>=275 && day<=305)
				{
 				System.out.println(+day+" October");		
				}		
				if(day>=306 && day<=335)
				{
 				System.out.println(+day+" November");		
				}
				if(day>=336 && day<=366)
				{
 				System.out.println(+day+ " December");		
				}
			}
			
		}	
	}
	
	public static void main(String[] args) 
	{
		year(2023);
	}

}
