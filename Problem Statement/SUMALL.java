
import java.util.Scanner;

class SUMALL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%11==0&&n%17==0){
			System.out.print("FooBar");
		}
		else if (n%11==0){
			System.out.print("Foo");
		}
		else if (n%17==0){
			System.out.print("Bar");
		}
	}	
}
