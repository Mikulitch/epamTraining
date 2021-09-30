package by.epam.group34.ex2.mikulich;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int year, month, result;
        boolean leapYear;

        System.out.println("Введите год в формате XXXX");
        year = scanner.nextInt();
        System.out.println("Введите месяц в формате XX");
        month = scanner.nextInt();
        leapYear = Daylogic.isYearLeap(year);
        result = Daylogic.daysCounter(leapYear,month);
        System.out.println("total days = "+ result);
    }
}