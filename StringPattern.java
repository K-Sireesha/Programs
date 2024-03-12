package programs_experiment;
import java.util.Arrays;
import java.util.Scanner;
//abbccccbbaaa
public class StringPattern
{
public static void main(String[] args) 
{		 String a="abc";
		 String b="",b1="",b2="",b3="";
		 for(int i=a.length()-1;i>=0;i--)
		 {
			 char c=a.charAt(i);
			 for(int j=i;j>=0;j--)
			 {
				 b=c+b;//abbccc
				 b1=b1+c;//cccbba
			 }
		 }
		 System.out.println(b); 
		 System.out.println(b1);
		 for(int i=0;i<=a.length()-1;i++)
		 {
			 char c=a.charAt(i);
			 for(int j=i;j<=a.length()-1;j++)
			 {
				 b2=b2+c;//aaabbc
				 b3=c+b3;//cbbaaa
			 }
		 }
		 System.out.println(b2); 
		 System.out.println(b3);
	
}  		
}



/*abbccc
for(int i=x.length()-1;i>=0;i--)
{
	char z=x.charAt(i);
	for(int j=i;j>=0;j--)
	{
		y=z+y;
	}	
}
System.out.println(y);
***************************
abbccccccbba
String x="abc";
String y="";
for(int i=x.length()-1;i>=0;i--)
{
	char z=x.charAt(i);
	for(int j=i;j>=0;j--)
	{
		y=z+y;
	}
	for(int k=i;k>=0;k--)
	{
		y=y+z;
	}			
}
System.out.println(y);	
*/
/*_______________________________________________________-

 String a="abcde";
		String b="",b1="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char c=a.charAt(i);
			for(int j=i;j>=0;j--)
			{
			   b=c+b;//abbcccddddeeeee
			   b=b+c;//eeeeeddddcccbba
			}
		}
		System.out.println(b); 
		for(int i=0;i<=a.length()-1;i++)
		{
			char c=a.charAt(i);
			for(int j=i;j<=a.length()-1;j++)
			{
			   b1=b1+c;//aaaaabbbbcccdde
			   b1=c+b1;//eddcccbbbbaaaaa
			}
		}
		System.out.println(b1); 
		
		
		
 String d="abc";
	  String e="",z="",z2="";
	  for(int i=d.length()-1;i>=0;i--)
	  {
		  char f=d.charAt(i);
		  for(int j=i;j>=0;j--)
		  {
			  e=f+e;
		  }
	  }
	  	//	System.out.println(e); //abbccc
	  		
	  	for(int x=d.length()-1;x>=0;x--)
	  	{
	  		char y=d.charAt(x);
	  		 z=z+y;		
	  	}
	  	//System.out.println(z);//cba
	  	
	  	for(int x1=z.length()-1;x1>=0;x1--)
	  	{
	  		char z1=z.charAt(x1);
	  		for(int i1=x1;i1>=0;i1--)
	  		{
	  			z2=z1+z2;
	  		}	
	  	}
	  //	System.out.println(z2);	//cbbaaa
	  	System.out.println(e.concat(z2));
}		
*/
	


