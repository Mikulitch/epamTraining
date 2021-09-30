package by.epam.group34.ex3.mikulich;

public class Geometrylogic {
    public static double radiusSize, smallAreaValue, compareResult ;

    public static double RadiusFinder (double squareArea) {
        return radiusSize = Math.sqrt(squareArea)/2;
    }
    public static double SquareAreaFinder (double circleRadius) {
        return smallAreaValue = 2*circleRadius*circleRadius;
    }
    public static double AreaComparison (double bigSquareArea, double smallSquareArea){
        return compareResult = bigSquareArea/smallSquareArea;
    }
}
