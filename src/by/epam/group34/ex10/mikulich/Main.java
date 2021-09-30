package by.epam.group34.ex10.mikulich;

import by.epam.group34.ex9.mikulich.ArithmeticLogic;

import java.util.Scanner;

public class Main {
    public static double a,b,h;

    public static double[] result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало отрезка: ");
        a = scanner.nextInt();
        System.out.print("Введите конец отрезка: ");
        b = scanner.nextInt();
        System.out.print("Введите значение шага прохождения по отрезку: ");
        h = scanner.nextInt();
        result  = LogicLine.FunctionResult(a,b,h);
        while (a<=b) {
        for (int i=0; i<result.length; i++) {
            System.out.println(a+"  |  "+result[i]);
            a+=h;
        }
        }
    }
}
