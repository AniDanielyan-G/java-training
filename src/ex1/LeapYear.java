package ex1;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear;

        if (year % 400 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }


        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
