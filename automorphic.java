import java.util.Scanner;
public static automorphic
{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int c=0,sqr=num*num;
		int temp=num;
		while(temp>0)
			{
			c++;
			temp=temp/10;
			}
				int lastSquareDigits=(int)(sqr%(math.pow(10,c)));
				if(num==lastSquareDigits)
					{
					System.out.println("automorphic number");
					}
						else
						{
						System.out.println("not a automorphic");
						}
		}
}

output:-enter a number
376=376*376=141376 automorphic number

enter a number
22=22*22=484 not a automorphic
