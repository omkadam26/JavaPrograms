import java.util.Scanner;

public class Question52 {
    public static void main(String args[])
    {
		int n;
		int arr(10);
		Scanner s=new Scanner(System.in);
		n=s.nextInt();	
		for(int i=0;i<=n;i++)
		{	
				System.out.println("Enter I'th Number :");
				arr[i]=s.nextInt();
			
		}
		for(int i=0;i<=n;i++)
		{
			System.out.println("I'th Number is :");
			System.out.println(arr[i]);
		}
    }

    
}
