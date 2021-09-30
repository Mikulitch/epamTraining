package by.epam.group34.ex10.mikulich;

public class LogicLine {

    static int i=0;
    public static double x;
    public static double[] FunctionResult(double a, double b, double h) {
        double[] result =new double[(int)((b-a)/h)+1] ;
    x=a;
      while (x<=b) {
        result[i] = Math.tan(x);
        i++;
        x+=h;
      }
      return result;
    }
}
