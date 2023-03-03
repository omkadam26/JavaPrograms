import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str1="i love my india";
        //System.out.println(str1);
        for(int i=0;i<str1.length();i++)
        {
            String[] str=str1.split(" ");
            System.out.println(str[i]);
            if(i==str1.length())
            {
                break;
            }
        }
        //System.out.println("i am new here...");
        
        
    }
    
}
