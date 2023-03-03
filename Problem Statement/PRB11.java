import java.util.Scanner;
class PRB11
{
	public static void main(String[] args)
          {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int x=sc.nextInt();
		System.out.println("x : "+x);
		int sum=0;
		while (x>0){
			int digit=x%10;
			sum+=digit;
			x=x/10;
		}
		System.out.println("Sum of digits is : "+sum);

	}	
}