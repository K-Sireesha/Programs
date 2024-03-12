package practicejfeb05;
import java.util.Arrays;
//Assignment Array Char_String
public class AssignmentArrayChar_String 
{
	public static void main(String[] args) 
	{
		char a[]=new char[7];
		a[0]='D';a[1]='E';a[2]='E';a[3]='P';a[4]='I';a[5]='K';a[6]='A';	
		for(int i=0;i<=6;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));	
		String b[]=new String[3];
		b[0] ="Sireesha";
		b[1] ="Deepika";
		b[2] ="Sharath";	
		for(int i=0;i<=2;i++)
		{
			System.out.println(b[i]);
		}	
		System.out.println(Arrays.toString(b));
	}

}
