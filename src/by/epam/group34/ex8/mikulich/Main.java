package by.epam.group34.ex8.mikulich;

import java.util.Scanner;

public class Main {
    public static  double  result, x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для вычисления значения функции введите значение Х: ");
        x = scanner.nextInt();
        result =FunctionLogic.Arithmetics(x);
        System.out.println("F(x) = "+result);
    }
}
