package by.epam.group34.ex6.mikulich;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalSeconds;
       String time;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите обще количество секунд: ");
      totalSeconds = scanner.nextInt();
      time = TimeLogic.SecondsCount(totalSeconds);
        System.out.println(time);
    }
}
