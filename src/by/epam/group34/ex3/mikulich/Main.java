package by.epam.group34.ex3.mikulich;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bigSquareArea, circleRadius, smallSquareArea, areaCompare;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь квадрата");
        bigSquareArea = scanner.nextInt();
        circleRadius = Geometrylogic.RadiusFinder(bigSquareArea);// Находим радиус
        smallSquareArea = Geometrylogic.SquareAreaFinder(circleRadius);
        areaCompare = Geometrylogic.AreaComparison(bigSquareArea,smallSquareArea);
        System.out.println("Площадь вписанного в окружность квадрата составляет: "+smallSquareArea);
        System.out.println("Площадь вписанного квадрата меньше площади заданного квадратав в: "+areaCompare +" раз(а)");
    }
}
