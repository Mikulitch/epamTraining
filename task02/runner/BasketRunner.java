package by.epam.group34.mikulich.task02.runner;

import by.epam.group34.mikulich.task02.entity.Ball;
import by.epam.group34.mikulich.task02.entity.Basket;
import by.epam.group34.mikulich.task02.entity.Colors;

import java.util.ArrayList;

public class BasketRunner {
        public static void main(String[] args) {
            ArrayList<Ball> balls = new ArrayList<>();

            balls.add(new Ball(Colors.BLUE, 0.8));
            balls.add(new Ball(Colors.YELLOW, 1.4));
            balls.add(new Ball(Colors.BLUE, 2.8));
            balls.add(new Ball(Colors.GREEN, 0.1));
            balls.add(new Ball(Colors.RED, 0.32));

            Basket basket = new Basket(balls);

            System.out.println("Оющий вес шаров в корзине " + basket.countTotalWeight(balls));
            System.out.println("Шароков "+ Colors.GREEN + " цвета в корзине: " +basket.getBallsAmountByColor(Colors.GREEN) );
        }
}
