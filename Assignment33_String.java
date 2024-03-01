package practicejfeb03;
//Vertical String - Name should be printed in reverse order
public class Assignment33_String 
{
	public static void main(String[] args) 
	{
		String a="Manish";
		int max=a.length();
		for(int i=max-1;i>=0;i--)
		{
			System.out.println(a.charAt(i));
		}
		
	}

}
