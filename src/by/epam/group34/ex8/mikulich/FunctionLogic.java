package by.epam.group34.ex8.mikulich;

public class FunctionLogic {
    public static double functionAnswer;

    public static double Arithmetics(double x){
        if (x>=3) {
            functionAnswer = -(x*x) +3*x +9;
        }
        else functionAnswer = 1/(Math.pow(x,3)-6);

        return functionAnswer;
    }
}
