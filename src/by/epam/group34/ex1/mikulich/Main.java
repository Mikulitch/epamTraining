package by.epam.group34.ex1.mikulich;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int a;
        int result;

        System.out.println("Введите число");
        a = scanner.nextInt();
        result = Logic.logicSqrNumber(a);
        System.out.println("Last number="+result);
    }
}
