package Lesson2;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //Using Scanner.utils for getting any word
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше слово: ");
        String word = scanner.nextLine();
        System.out.println("Введенное вами слово -" + '\'' + word + '\'');

    }
}
