class solution
{
	public:int subtractproductandsum (int n)
	{
	int sum =0;
	int product =1;
	while (n>0)
		{
		sum+=n%10;
		product*=n%10;
		n/=10;
		}
			return product-sum;
	}
}
	public main () 
	{
	solution ob;
	cout<<ob.subtractproductandsum(5362);
	}

	output:-5362
		164