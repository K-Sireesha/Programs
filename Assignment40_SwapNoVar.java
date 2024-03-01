package practicejfeb09;
//Assignment - Swapping 2 values without using variable
public class Assignment40_SwapNoVar 
{
	public static void main(String[] args) 
	{
		int a=21,b=4;
		a=a+b;//a = 25
		b=a-b;//25-4 = 21 - updated b value
		a=a-b;//25-21 = 4 - updated a value
		System.out.println("Value of a after swapping"+a);
		System.out.println("Value of b after swapping"+b);
		
		String c="Kalle",d="Sireesha";
		c=c+d;//KalleSireesha
		d=c.substring(0,5);
		c=c.substring(5);
		System.out.println("Value of c after swapping"+c);
		System.out.println("Value of d after swapping"+d);
	}

}
