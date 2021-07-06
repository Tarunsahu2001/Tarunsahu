import java.util.*;
public class test
{
	public static void main(String[]args)
		{
		Scanner sc=newScanner(System.in)
		int arr[]=new int[10];
		System.out.println("Enter elements in array");
		int min=Integer.Max_Value;
		int max=Integer.Min_Value;
		for(int i=0;i<=9;i++)
			{
			arr[i]=sc.nextInt();
			if(arr[i]<min)
				{
				min=arr[i]
				}
					if(arr[i]>max)
						{
						max=arr[i];
						}
							{				
							System.out.println("Maximum element is "+max);
							System.out.println("Minimum element is "+min);
			}							}
}

output:-
Enter elements in array 
12
13
15
43
67
55
99
16
19
2
Maximum elements is 99
Minimum elements is 2
