class TotalAverage
{
	static int a,b;
	static int total;
	static double average;
	static void calculate()
	{
		total = a + b;
		average = total / 2.0;
	}
	public static void main(String[] args)
	{
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		calculate();
		
		System.out.println("First number: " + a);
		System.out.println("Second number: " + b);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
}
}