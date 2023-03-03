import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
 public class EvenRange {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter N : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0) 
                System.out.println(i);
                sum=i+sum;
                System.out.println(sum);

                
        }
        System.out.println("The Sum of EVen Number : "+sum);
        
    }

    
}