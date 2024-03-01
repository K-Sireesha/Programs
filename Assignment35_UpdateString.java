package practicejfeb06;
//Input - RamMohan, Output - MohanRam using substring
public class Assignment_UpdateString
{
	public static void main(String[] args) 
	{
		String a="RamMohan";
		String b=a.substring(3,a.length());
		String c=a.substring(0,3);
		System.out.println(b.concat(c));
		//System.out.println(b+c);	
		String a1="RamMohan";
		String b1=a1.substring(3);
		String c1=a1.substring(0,3);
		System.out.println(b1.concat(c1));
		//System.out.println(b+c);
	}	
}
