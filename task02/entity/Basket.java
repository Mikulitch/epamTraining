package by.epam.group34.mikulich.task02.entity;

import java.util.ArrayList;


    public class Basket {

       private ArrayList<Ball> balls = new ArrayList<Ball>();
        private double weight;

        public ArrayList<Ball> getBalls() {
            return balls;
        }

        public void setBalls(ArrayList<Ball> balls) {
            this.balls = balls;
        }

        public Ball get(int index) {
            return balls.get(index);
        }


        public void add(Ball ball) {
            balls.add(ball);
        }

        public void remove(Ball ball) {
            balls.remove(ball);
        }

        public void clear() {
            balls.clear();
        }

        public Basket() {
        }

        public Basket(ArrayList<Ball> balls) {
            for (Ball ball: balls) {
                add(ball);
            }
        }

        public double countTotalWeight(ArrayList<Ball> balls) {
            double weight = 0;
            for (Ball ball :
                    balls) {
                weight += ball.getWeight();
            }
            return weight;
        }

        public int getBallsAmountByColor(Colors color) {
            int numOfBallColor = 0;
            for (Ball ball :
                    balls) {
                if (ball.getColor() == color)
                    numOfBallColor++;
            }
            return numOfBallColor;
        }
    }

