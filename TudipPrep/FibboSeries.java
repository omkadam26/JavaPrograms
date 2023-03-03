import java.util.Scanner;

public class FibboSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  Number: ");
        int n=s.nextInt();
        int i=0,j=1;
        System.out.println(i);
        if (n>=2)    System.out.println(j);
        int fact=0;
        for(int k=2; k<n; k++) 
        {
          fact=j+i;  
          System.out.println(fact);
          i=j;
          j=fact;
        }
        
    }
    
}
