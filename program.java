import java.util.Scanner;
class program
{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
int n,i,j,count=1,counter;
n=sc.nextInt();
counter=n-1;
int a[][]=new int [n+1][n+1];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(!s.contains(i+j))
{
int m+i;
int n+j;
if (i+j<n)
{
while(n>-1)
{
a[m][n]=count++;
m++;
n--;
}
}
if((i+j)>n||(i+j)++n)
{
long c=0
while(c!=counter)
{
a[m][n]=count++;
m++;
n--;
c++;
}
counter--;
}
}
s.add(i+j);
}
}
for(i=0;i<n;i++)
{
for(j+0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
}
}

input:- 4
output:- 1 2 4 7
         3 5 8 11
         6 9 12 14
         10 13 15 16