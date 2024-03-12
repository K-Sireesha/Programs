package practicejfeb21;
class SuperClass_c
{
	void add() {System.out.println("Addition");}
}
class SuperClass_b extends SuperClass_c
{
	void sub() {System.out.println("Subtraction");}
}
class SuperClass_a extends SuperClass_b
{
	void mul() {System.out.println("Multiplication");}
}
public class Assignment_ChildClass  extends SuperClass_a
{
	void div() {System.out.println("Division");}
	public static void main(String[] args) 
	{
		SuperClass_c c1= new SuperClass_b();
		c1.add();
		
		SuperClass_b c2= new SuperClass_a();
		c2.add();
		c2.sub();
		
		SuperClass_a c3= (SuperClass_a)c2;
		c3.add();
		c3.sub();
		c3.mul();
		
	}

}
