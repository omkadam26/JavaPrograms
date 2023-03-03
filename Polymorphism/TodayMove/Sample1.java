|

//java program for leap year?

class Sample1{


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
public static void main(String[] args) {
    isLeapYear(2022);

}


}

//java program for constructor?



class Bicycle
{
    // class-level variables
    private int gear;
    private int cadence;
    private int speed;

    // constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // another method (not a constructor)
    public void ShiftUp() {
        gear = gear + 1; // notice the 'gear' variable is available here too.
    }
}












