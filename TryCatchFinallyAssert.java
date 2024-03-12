package programs_experiment;
import java.util.Scanner;
public class TryCatchFinallyAssert {
	public static void main(String[] args) {
		Test();
	}
	 static void Test()
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		try {
		assert a!=10:"Execution dependency";
		for(int i=0;i<a;i++)
		{
		System.out.println(i);
		}
		}
		catch(AssertionError a1)
		{
			System.out.println("Condition not met");
		}
		finally
		{
			
			for(int i=0;i<a;i++)
			{
			System.out.println(i);
			}
		}
	
	}

}
