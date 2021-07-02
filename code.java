import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.biginterger;
class code
{
	public static void main(String[]args)
		{
		final bufferreader bf=new bufferreader9System.in);
		final int t=integer.parseInt(bf.readLine());
		for (int i=0;i<t;i++)
			{
			System.out.println(fact(integer.parseInt(bf.readLine())));
			}
		}
			private static biginteger fact(int n)
				{
				biginteger result=biginteger.ONE;
				for(int i=2;i<=n;i++)
					{
					result=result.multiply(biginteger.valueOf(i));
					}
						return result;
				}
}

input:- 4
	1
	2
	5
	3

output:-1
	2
	120
	6