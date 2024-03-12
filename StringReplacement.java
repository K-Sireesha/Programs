package practicejfeb13;
public class Assignment_StringReplacement 
{
	public static void main(String[] args) 
	{
		String a="Kalle Sireesha";
		String a1=a.replaceAll("Kalle", "Vutla");
		System.out.println(a1);
		
		System.out.println(a1.replaceAll("[a-z]", " "));//removes lowercase letters
		System.out.println(a1.replaceAll("[A-Z]", " "));//removes uppercase letters
		String a2=a.replace('e', 'i');
		System.out.println(a2);	
	}

}
