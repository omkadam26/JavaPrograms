import java.util.Scanner;


public class Palindrom {
	public static void main(String[] args) {
		System.out.println("enter A string :");
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		System.out.println("The Length of Given String is    "+s1.length());
	
		System.out.println();
		System.out.println("Now We are Checking The String is Palindrom or Not");
		int i=0;
		char find;
		try {
		for( i=0;i<=s1.length();i++)
		{
			find=s1.charAt(i);
			for(int j=s1.length();j<=s1.length();j--)
			{
				if(find==s1.charAt(j))
				{
						System.out.println("LastMatchFound");
				}
			}
			
					
		}
		
	}catch(Exception e){
		System.out.println("The Successfully handle Exception");
		
	}
	}

}
