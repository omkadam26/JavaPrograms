import java.util.Arrays;

public class CheckArraysEQL {
    
    public static void main(String[] args) 
    {
        int a[]=new int[]{10,20,4,21,89,90};
        int b[]=new int[]{10,20,4,21,89,90};
        Arrays.sort(a);
        Arrays.sort(b);
       System.out.print("result of First Loop  ");
       System.out.println("             Second Loop");
        for(int i=0;i<a.length;i++){
            System.out.print("            "+a[i]+"                       ");
            System.out.println(b[i]);
          
        }
        }

 }

