import java.util.Scanner;
public class main
{
	public static void main(Strings[]args)
		{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(solve(n));
		sc.close();
		}
			static int solve(int n)
			{
			return (n%4==0)?(n+1):(n-1);
			}
}

 input:- 5
 output:-4
