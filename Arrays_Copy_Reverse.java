package programs_experiment;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Copy_Reverse {
	
	static void number()
	{
		Scanner s1=new Scanner(System.in);
		int a[]=new int[4]; int k=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(a));
		//for(int i=a.length-1;i>=0;i--) 
		for(int i=0;i<a.length;i++)
		{
			b[k]=a[i];
			k++;	
		}
		System.out.println(Arrays.toString(b));
		if(Arrays.equals(a, b)==true)
		{
			System.out.println("Arrays are Equal");
		}
		else {System.out.println("Arrays are not Equal");}
		
	}

	public static void main(String[] args) 
	{
		number();
	}

}
