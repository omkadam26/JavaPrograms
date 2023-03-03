import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=s.next();
        StringBuffer sb=new StringBuffer(str); 
        sb.reverse();       
        if(str.equals(sb.toString()))
             System.out.println("Palindrome.");
          
        else
            System.out.println("Not Palindrome.");
        
    }
}
