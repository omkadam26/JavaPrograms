import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number  :  ");
		int a=s.nextInt();
		isEven(a);
		isEven(100);
	}
	public static void isEven(int a)
	{
			if(a%2==0)
				System.out.println(+a+"   Is Even NUmber");
			else
				System.out.println(+a+"   is Odd NUmber ");
	}

}

