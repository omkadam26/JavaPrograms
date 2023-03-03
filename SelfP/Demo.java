class B
{

	void findMe()
	{
		System.out.println("in B");
	}
}
class A extends B
{

	void findMe()
	{
			System.out.println("Inside A");
	}
}

class Demo extends A
{
	public static void Main(String args[])
	{
			System.out.println("Inside Main.");

			A a=new A();
				a.findMe();

			B b=new A();
			b.findMe();
	}

}