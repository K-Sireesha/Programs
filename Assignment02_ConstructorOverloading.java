package practicejan04;
//Constructor Overloading with Parameterized and Non-Parameterized Arguments
public class Assignment02_ConstructorOverloading
{	Assignment02_ConstructorOverloading()
	{
		System.out.println("Non-parameterized constructor");
	}
	Assignment02_ConstructorOverloading(int a)
	{
		System.out.println("Parameterized constructor with datatype as int");
	}
	Assignment02_ConstructorOverloading(boolean a)
	{
		System.out.println("Parameterized constructor with datatype as boolean");
	}
	Assignment02_ConstructorOverloading(String a)
	{
		System.out.println("Parameterized constructor with datatype as String");
	}
	Assignment02_ConstructorOverloading(char a)
	{
		System.out.println("Parameterized constructor with datatype as char");
	}
	public static void main(String[] args) 
	{System.out.println("Calling multiple constructors with different Datatypes");
		new Assignment02_ConstructorOverloading();
		new Assignment02_ConstructorOverloading(9);
		new Assignment02_ConstructorOverloading(true);
		new Assignment02_ConstructorOverloading("s");
		new Assignment02_ConstructorOverloading('s');
	}}
