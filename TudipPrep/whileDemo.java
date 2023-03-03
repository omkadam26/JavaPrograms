import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("WhileDemo Program.");
        
        System.out.println("ENter ANy Number :");
        int check=s.nextInt();        
        while(check!=0)
        {
            System.out.println("value is : "+check);
            i++;
            System.out.println("Enter NUmber :");
            check=s.nextInt();
        }
        

    }
}
