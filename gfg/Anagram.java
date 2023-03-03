import java.util.Arrays;

class Anagram {
  public static void main(String[] args) {
    String str1 = "Race";
    String str2 = "Care";
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}








































// public class Anagram {
//     public static void main(String[] args) {
//         String a="Race";
//         String b="raRe";

//         a=a.toLowerCase();
//         b=b.toLowerCase();

//         System.out.println(a+" "+b);

//         if(a.length()==b.length())
//         {
//           char[] charArray1 = a.toCharArray();
//           char[] charArray2 = b.toCharArray();
    
//           // sort the char array
//           Arrays.sort(charArray1);
//           Arrays.sort(charArray2);
    
//           // if sorted char arrays are same
//           // then the string is anagram
//           boolean result = Arrays.equals(charArray1, charArray2);
    
//           if(result) {
//             System.out.println(a + " and " + b + " are anagram.");
//           }
//           else {
//             System.out.println(a + " and " + b + " are not anagram.");
//           }
//         }
    
        
//     }
    
// }
