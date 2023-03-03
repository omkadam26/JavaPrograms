import java.util.Scanner;

public class ExceptionClass {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Implementation of Exception class....");
       try{
        System.out.println("Enter Two Number : ");
       int a=s.nextInt();
       int b=s.nextInt();
        if(a==0||b==0)
        {
            System.out.println("do not enter 0 .");
        }
        int c=a/b;
        System.out.println("result"+c);
       
            System.out.println("we are in try block...");
        }catch(ArithmaticException e)
        {
            System.out.println("we Successfully handled Exception.....");
        }
    
}
}

