class MethodOL
{
	float add(float n1,float n2)
	{
		return(n1+n2);
	}
	double add(double n1,double n2,double n3)
	{
		return(n1+n2+n3);
	}
	public static void main(String[] args) 
	{
		MethodOL sum = new MethodOL();
		float result = sum.add(2.5f,3.5f);
		System.out.println("result for 2 parameters:  "+result);
		double result1 = sum.add(14.00,4.00,6.00);
		System.out.println("result for 3 parameters " +result1);
	}
}