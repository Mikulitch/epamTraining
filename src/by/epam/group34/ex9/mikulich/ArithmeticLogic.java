package by.epam.group34.ex9.mikulich;

public class ArithmeticLogic {
    public static  double length, area;
    public static final double Pi = 3.1415;
    public static double FindArea (int radius) {
        area = Pi*radius*radius;
        return area;
    }

    public static double FindLength(int radius) {
        length = 2*Pi*radius;
        return length;
    }
}
