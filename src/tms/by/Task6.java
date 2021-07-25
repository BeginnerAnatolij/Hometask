package tms.by;

import java.util.Scanner;

       public class Task6 {
           public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
               System.out.println("Введите трёхзначное число = ");
               int input = scanner.nextInt();
               int firstNum = input % 10;
               int temp = input / 10;
               int secondNum = temp % 10;
               int thirdNum = input / 100;
               System.out.println("Произведение чисел = "+firstNum * secondNum * thirdNum);
           }
       }
