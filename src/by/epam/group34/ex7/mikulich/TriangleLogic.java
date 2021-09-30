package by.epam.group34.ex7.mikulich;

public class TriangleLogic {
    public static double hupotenuse;
    public static String answer;
    public static double FindHypotenuse(int x, int y) {
        hupotenuse = Math.sqrt(x*x + y*y);
        System.out.println(hupotenuse);
        return hupotenuse;
    }

    public static String HupoCompare(double hupo1, double hupo2) {
        if (hupo1>hupo2) {
            answer = "Точка два ближе к началу координат Х и Y";
        }
            else if (hupo1<hupo2) {
            answer = "Точка один ближе к началу координат Х и Y";
            } else answer = "Точка на одинаковом расстоянии от начала координат Х и Y";

            return answer;
    }
}
