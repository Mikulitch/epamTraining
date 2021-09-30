package by.epam.group34.ex2.mikulich;

public class Daylogic {
    public static int days;

    public static boolean isYearLeap(int year) {
      if (year%4==0) {
            return true;
        }
      else
        return false;
        }
    public static int daysCounter(boolean leapYear, int month) {
        switch (month) {
            case 1,3,5,7,8,10,12:
                days = 31;
                break;
            case 2:
                if (!leapYear) {
                    days = 28;
                    break;
                }
                else {days = 29;
                break;}
            default: days = 30;
        }

        return days;
    }

}
