package by.epam.group34.ex1.mikulich;

public class Logic {
    public static int result, lastNumber;
    public static int logicSqrNumber(int a) {
        lastNumber = a%10;
       switch (lastNumber) {
        case 0 :
            result = 0;
            break;
           case 1:
               result = 1;
               break;
           case 2:
               result = 4;
               break;
           case 3:
               result = 9;
               break;
           case 4:
               result = 6;
               break;
           case 5:
               result = 5;
               break;
           case 6:
               result = 6;
               break;
           case 7:
               result = 9;
               break;
           case 8:
               result = 4;
               break;
           case 9:
               result = 1;
               break;
       }
    return result;
    }
}
