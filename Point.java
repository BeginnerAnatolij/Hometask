package hometask2;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point pointTwo) {
        return Math.sqrt((pointTwo.x - this.x) * (pointTwo.x - this.x) + (pointTwo.y - this.y) * (pointTwo.y - this.y));

    }

}
