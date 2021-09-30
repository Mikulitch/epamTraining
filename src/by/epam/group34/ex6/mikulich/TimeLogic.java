package by.epam.group34.ex6.mikulich;

public class TimeLogic {
public static int minutes=0, hourse=0, seconds=0;
public static String timeLine;
    public static String SecondsCount (double sec) {
        if (sec>=60) {
            minutes = (int)sec/60;
            seconds = (int)((sec/60-minutes)*60);
        }
        else timeLine = ("Прошло "+hourse+" часа(ов), "+minutes+" минут(ы) , "+seconds+" секунд(ы)");
    if (minutes>=60) {
        hourse =(int)minutes/60;
        minutes = (int)((minutes/60.0-hourse)*60);
        timeLine = ("Прошло "+hourse+" часа(ов), "+minutes+" минут(ы) , "+seconds+" секунд(ы)");
    }
     else timeLine = ("Прошло "+hourse+" часа(ов), "+minutes+" минут(ы) , "+seconds+" секунд(ы)");

     return timeLine;
    }

}
