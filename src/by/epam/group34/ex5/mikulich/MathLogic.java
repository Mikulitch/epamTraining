package by.epam.group34.ex5.mikulich;

public class MathLogic {
     static  int sum=0;
    public static boolean isPerfectNumber (int number) {

        for (int i = number/2; i>0;i--) {
            if(number%i==0) {
                sum+=i;
            }
        }
        if(sum==number) {
            return true;
        }else return false;
    }
}
