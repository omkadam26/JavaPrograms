
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("x : "+x);
		int sum=0;
		while (x>0){
			int digit=x%10;
			sum+=digit;
			x/=10;
		    }
		System.out.println("Sum of digits is : "+sum);

	}	
}