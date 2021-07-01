import java.util.Scanner
public class rightpyramid
{
	public static void main (String[]args)
		{
		int i,j,n;
		Scanner sc=new Scanner (System.in);
		System.out.print("number of rows want");
		n=sc.nextInt();
		for(i=o;i<=n-1;i++)
			{
			for(j=0;j<=i;j++)
				{
				System.out.print("*"+" ");
				}
				System.out.printn("");
			}
			for( i=n-1;i>=0;i--)	
				{
				for ( j=0;j<=i-1;j++)
					{
					System.out.print("*"+" ");
					}
						System.out.println("");
				}
		}
}