//program for even number in java?


for (int i = 1; i <= num; i++) {
    if (i % 2 == 0) {
        System.out.print("\n" + i + " Is Even");
    } else {
        System.out.print("\n" + i + " Is Odd");
    }
}


public class EvenOdd {
    public static void main(String[] args) {
        // input
        System.out.print("\nEnter a number less than 100: ");

        // variable
        int num = Expo.enterInt();

        System.out.println();

        // output
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Is Even");
            } else {
                System.out.println(i + " Is Odd");
            }
        }
    }
}

//java program for leapyear?


public static boolean isLeapYear(int year) {
  Calendar cal = Calendar.getInstance();
  cal.set(Calendar.YEAR, year);
  return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
}


public static boolean isLeapYear(int year) {
  if (year % 4 != 0) {
    return false;
  } else if (year % 400 == 0) {
    return true;
  } else if (year % 100 == 0) {
    return false;
  } else {
    return true;
  }
}


//java program for string concatination ?


public class Concat {
    String cat(String a, String b) {
        a += b;
        return a;
    }
}


java.lang.String cat(java.lang.String, java.lang.String);
  Code:
   0:   new     #2; //class java/lang/StringBuilder
   3:   dup
   4:   invokespecial   #3; //Method java/lang/StringBuilder."<init>":()V
   7:   aload_1
   8:   invokevirtual   #4; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   11:  aload_2
   12:  invokevirtual   #4; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   15:  invokevirtual   #5; //Method java/lang/StringBuilder.toString:()Ljava/lang/    String;
   18:  astore_1
   19:  aload_1
   20:  areturn


a = new StringBuilder()
    .append(a)
    .append(b)
    .toString();










//program for thread in java?


