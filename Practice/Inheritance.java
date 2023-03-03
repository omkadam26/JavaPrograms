
import java.util.*;

import javax.sound.sampled.SourceDataLine;

class Inheritance
{
    public static void main(String[] args) {
        System.out.println("we are inside main function...used to extend the class to implement inheritance...");

        System.out.println("you are in parent class...");
        parent p=new parent();
        p.display();

    }
}
class parent extends Inheritance
{
    void display()
    {
        System.out.println("You are in child class....");
    }
}



