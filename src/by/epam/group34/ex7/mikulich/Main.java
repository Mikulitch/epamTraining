package by.epam.group34.ex7.mikulich;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        double hupo1, hupo2;
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение координаты Х первой точки");
        x1 = scanner.nextInt();
        System.out.println("Введите значение координаты Y первой точки");
        y1 = scanner.nextInt();
        System.out.println("Введите значение координаты Х второй точки");
        x2 = scanner.nextInt();
        System.out.println("Введите значение координаты Y второй точки");
        y2 = scanner.nextInt();
        hupo1 = TriangleLogic.FindHypotenuse(x1,y1);
        hupo2 = TriangleLogic.FindHypotenuse(x2,y2);
        result = TriangleLogic.HupoCompare(hupo1, hupo2);
        System.out.println(result);

    }
}
