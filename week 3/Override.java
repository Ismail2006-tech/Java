class  A
{
	int i,j;
	A(int a,int b)
	{
	i=a;
	j=b;
	}
	void show(int i,int j)
	{
		System.out.println("i and j : "+i+""+j);
	}	
}
class B extends A
{
	int k;
	B(int a,int b,int c)
	{
	super(a,b);
	k=c;
	}
	void show(int k)
	{
	System.out.println("k: "+k);
	}
}
class Override
{
	public static void main(String args[])
	{
	B subOB=new B(5,3,8);
	subOB.show(8);
	}
}