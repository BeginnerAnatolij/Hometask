package hometask2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleTwo = new Rectangle();
        Rectangle rectangleOne = new Rectangle(2, 4, 5, 2);
        double area = rectangleOne.square();
        System.out.println(area);
        double perimiterone = rectangleOne.perimeter();
        System.out.println(perimiterone);
        double diagonalone = rectangleOne.diagonal();
        System.out.println(diagonalone);
    }
}
