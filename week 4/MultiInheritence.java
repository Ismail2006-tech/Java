class Student
{
	int RollNumber;
	void getNumber(int n)
	{
		RollNumber=n;
	}
	void printNumber()
	{
		System.out.println("Roll Number: "+RollNumber);
	}
}
class test extends Student
{
	float part1,part2;
	void getMarks(float a,float b)
	{
		part1=a;
		part2=b;
	}
	void putMarks()
	{
		System.out.println("Part1 marks: "+part1);
		System.out.println("Part2 marks: "+part2);
	}
}
interface sports
{
	float sportwt = 6.0F;
	void putwt();
}
class results extends test implements sports
{
	float total;
	public void putwt()
	{
		System.out.println("Sport weightage: "+sportwt);
	}
	void display()
	{
		total=part1+part2+sportwt;
		System.out.println("Total marks: "+total);
	}
}
class MultipleInheritance
{
	public static void main(String args[])
	{
		results a = new results();
		a.getNumber(10);
		a.printNumber();
		a.getMarks(50.0F,45.6F);
		a.putMarks();
		a.putwt();
		a.display();
	}

}