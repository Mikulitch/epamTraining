package by.epam.group34.ex4.mikulich;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count= 0;
        int A=0,B=0,C=0,D=0;
        System.out.print("Введитечисло A: ");
        A=scanner.nextInt();
        System.out.print("Введитечисло B: ");
        B=scanner.nextInt();
        System.out.print("Введитечисло C: ");
        C=scanner.nextInt();
        System.out.print("Введитечисло D: ");
        D=scanner.nextInt();
        if (CheckLogic.evenCheck(A)) {
            count++;
        }
        if (CheckLogic.evenCheck(B)) {
            count++;
        }
        if (CheckLogic.evenCheck(C)) {
            count++;
        }
        if (CheckLogic.evenCheck(D)) {
            count++;
        }
        if(count>=2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}


