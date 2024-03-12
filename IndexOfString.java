package programs_experiment;
import java.util.Scanner;
public class IndexOfString {
	
	static void Index()
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		System.out.println(a.length());
		char c[]=a.toCharArray();
		for(int i=0;i<=a.length()-1;i++)
	  {
			boolean a1= Character.isAlphabetic(c[i]);
			boolean a2=Character.isDigit(c[i]);
			boolean a3=Character.isWhitespace(c[i]);
		if(a1==false&&a2==false&&a3==false)
		{
			//System.out.println("String has spcl characters");
			System.out.println("Index of "+c[i]+" is "+a.indexOf(c[i], i));
		}
		else //if(a1==true||a2==true||a3==true)
		{
			System.out.println("Index of "+c[i]+" is "+a.indexOf(c[i], i));
			
		}
	  }
	}

	public static void main(String[] args) 
	{
		Index();

	}

}
