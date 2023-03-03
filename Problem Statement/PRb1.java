import java.util.Scanner;
class PRb1
{
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Two Numbers : ");
                int a=sc.nextInt(),b=sc.nextInt();
            
                System.out.println("a : "+a+" b : "+b);
                b=a+b;
                a=b-a;
                b=b-a;
                System.out.println("a : "+a+" b : "+b);
        
            
        
    }
}