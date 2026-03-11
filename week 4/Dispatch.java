//DYNAMIC DISPATCH METHOD 
class A
{
	void callme()
	{
		System.out.println("Calling A's callme Method");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("Calling B's callme Method");
	}
}
class C extends B
{
	void callme()
	{
		System.out.println("Calling C's callme Method");
	}
	void callme1()
	{
		System.out.println("Calling C's callme1 Method");
	}
}
class Dispatch
{
	public static void main(String args[])
	{
		/*A a = new A(); One method
		  B b = new B();
		  C c = new C();
		  A r;
		  r=a;
		  r.callme();
		  r=b;
		  r.callme();
		  r=c;
		r.callme();*/
		A r; //Another method
		r=new A();
		r.callme();
		r=new B();
		r.callme();
		r=new C();
		r.callme();
	}

}