package by.epam.group34.ex5.mikulich;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean result;
        int number=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        number = scanner.nextInt();
        result = MathLogic.isPerfectNumber(number);
        System.out.println("Значение "+number+" совершенно - это "+result);
    }
}
