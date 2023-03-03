import java.util.*;


public class Test {
    public static void main(String[] args) {
        System.out.println("Start @omkadam");
        
	Parent p=new Child();
	p.m1();

         System.out.println("ENd @omkadam");
    }
    

}

class Parent {

     //if the 
    void m1()
    {
        System.out.println("Inside Parent ----> M1 ");
    }
    
}
class Child extends Parent {
    void m1()
    {
	 //First Preference Given to the Local Variable thats why it come first.
           System.out.println("Inside Child M1  ---> We are Ovverriding the M1");
     }
}
