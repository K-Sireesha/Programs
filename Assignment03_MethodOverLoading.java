package practicejan05;
//Method Overloading using Static & Non-Static Methods with Parameterized Arguments
public class Assignment03_MethodOverLoading 
{
	public void eighth(int a,int b,double c)
	{System.out.println("Non-static method1");}
	private void eighth(double a,int b,int c)
	{System.out.println("Non-static method2");}
	void eighth(int a,double b,int c)
	{System.out.println("Non-static method3");}
	public static void eighth(String a, char b)
	{System.out.println("Static method1");}
	static void eighth(char a, String b)
	{System.out.println("Static method2");}
public static void main(String[] args) 
{
	eighth("Siri",'s');
	eighth('s',"Sireesha");
	Assignment03_MethodOverLoading a1= new Assignment03_MethodOverLoading();
	a1.eighth(1,900,34.78);
	a1.eighth(6,29.870,8888);
	a1.eighth(4.1,210,78);
}
}
