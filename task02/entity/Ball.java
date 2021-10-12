package by.epam.group34.mikulich.task02.entity;

public class Ball {
    private Colors color;
    private double weight;


    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Ball(Colors color, double weight)  {
        this.color = color;
        this.weight = weight;
    }

    public Ball() {}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ball ball = (Ball) obj;
        return weight == ball.weight && color == ball.color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "color=" + color +
                ", weight=" + weight;
    }
}
