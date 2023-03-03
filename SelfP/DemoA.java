import java.util.*;

class DemoA  extends DemoB
{
	public static void main(String args[])
	{
		System.out.println("Start @omkadam");
		DemoB db=new DemoB();
		db.m1();
		

		System.out.println("Stop @omkadam");
	}



}

abstract class DemoB
{
	 void m1()
	{
			System.out.println("Inside M1 Method.");
	}
	


}