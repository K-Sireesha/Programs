package programs_experiment;
class Details
{
	String name="Siddharth";
	public void setname()
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	int age=32;
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}
	String gender="Female";
	public void setgender(String gender)
	{
		this.gender=gender;
	}
	public String getgender()
	{
		return gender;
	}
	
	long no=7789977;
	public void setno(long no)
	{
		this.no=no;
	}
	public long getno()
	{
		return no;
	}
}

public class Encapsulation 
{
public static void main(String[] args) 
{
	  Details d1=new Details();
	  d1.setname();
	  System.out.println("Name : "+d1.getname());
	  
	  d1.setage(29);
	  System.out.println("Age : "+d1.getage());
	  
	  d1.setgender("Male");
	  System.out.println("Gender : "+d1.getgender());
	  
	  d1.setno(76429383);
	  System.out.println("Mobile : "+d1.getno());	  
}
}
