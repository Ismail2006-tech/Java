package p1;
// Instantiate the various classes in p2
import p1.Protection;
import p1.Derived;
import p1.SamePackage;
public class Demop1
{
	public static void main(String args[])
	{
		Protection ob1=new Protection();
		Derived ob2=new Derived();
		SamePackage ob3=new SamePackage();
	}
}