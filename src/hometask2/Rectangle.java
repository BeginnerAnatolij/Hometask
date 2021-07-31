package hometask2;

public class Rectangle {
    public Point leftTop;
    public Point bottomRight;

    public Rectangle(Point leftTop, Point bottomRight) {
        this.leftTop = leftTop;
        this.bottomRight = bottomRight;
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        leftTop = new Point(x1, y1);
        bottomRight = new Point(x2, y2);
    }

    public Rectangle() {
        System.out.println("Вызывается конструктор без параметров");
    }

    public double square() {
        double leftSide = Math.abs(bottomRight.getX() - leftTop.getX());
        double bottomSide = Math.abs(bottomRight.getY() - leftTop.getY());
        double square = leftSide * bottomSide;
        return square;
    }

    public double perimeter() {
        double leftSide = Math.abs(bottomRight.getX() - leftTop.getX());
        double bottomSide = Math.abs(bottomRight.getY() - leftTop.getY());
        double perimeter = Math.abs(2 * (leftSide + bottomSide));
        return perimeter;
    }

    public double diagonal() {
        double leftSide = Math.abs(bottomRight.getX() - leftTop.getX());
        double bottomSide = Math.abs(bottomRight.getY() - leftTop.getY());
        double diagonal = Math.sqrt(Math.abs((leftSide * leftSide + bottomSide * bottomSide)));
        return diagonal;
    }
}
