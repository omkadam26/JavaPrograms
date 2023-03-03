import java.util.Scanner;


class ATM
{
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        ATM a=new ATM();
        ATM a1=new ATM(10,20);

        


    }
}
ATM(int a,int b)
{
    System.out.println("We are inside parameterized constructor....");

}


ATM()
{
    System.out.println("We are inside COnstructor...");

    return;

}