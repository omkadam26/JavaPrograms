import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of which factorial wants to calc");
		int forNum=s.nextInt();
		int fact=1;
		System.out.println("Enter NUmber for FInding a Factorial");
		
		
		for(int i=1;i<=forNum;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		lengthFinder();
		
		int x=50;
		int y=20;
		add(x,y);
	}
	public static void lengthFinder()
	{
		System.out.println("We are in Length Finder Method of Factorial class");
		String name="omkadam";
		System.out.println(name);
		System.out.println("and Size of name is "+name.length());
	}
	public static void add(int x,int y)
	{
		System.out.println("In this Method we are Adding two numbers taken by users...");
		System.out.println("Enter Two Numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("The Addition of Two Numbers is :"+(num1+num2));
		System.out.println("======PassBy Value========");
		System.out.println("The Addition of Two Numbers Taken as Argument is "+(x+y));
	}
	

}
