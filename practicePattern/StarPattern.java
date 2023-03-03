import javax.sound.sampled.SourceDataLine;

public class StarPattern {
    public static void main(String[] args) {
        int i=2;
        if(i%2==0)
        {
            System.out.println("*");
            i++;
            System.out.println(i);
            ++i;
            System.out.println(i);
            i++;
            System.out.println(i);
        }
        else{
            System.out.println();
        }
    }
    
}
