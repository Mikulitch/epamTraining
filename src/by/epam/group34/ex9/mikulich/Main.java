package by.epam.group34.ex9.mikulich;



import java.util.Scanner;

public class Main {
    public static int radius;
    public static double circleLength, circleArea;
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("Введите радиус окружности: ");
          radius = scanner.nextInt();
          circleArea = ArithmeticLogic.FindArea(radius);
          circleLength =ArithmeticLogic.FindLength(radius);
          System.out.println("Длина окружности составляет: "+circleLength);
          System.out.println("Площадь окружности равна: "+circleArea);
    }
}
