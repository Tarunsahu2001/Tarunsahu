import java.util.Scanner 
public class replace 0 to 1
{
	public static void main (Strings args[])
	{
	Scanner sc= new Scanner (system.in);
	System.out.println("enter the number :");
	int number=sc.nextInt();
	String str=Integer.toString(number);
	int len=str.length();
	String str1="";
	for ( int i=0;i<len;i++)
		{	
		if (str.charAt(i)=='0')
		str1=str1+'1';
		else 
		str1=str+str.charAt(i);
		}
			System.out.println("output :"+str1);
			sc.close();
	}
}


enter the number:- 5005
output:- 5115
