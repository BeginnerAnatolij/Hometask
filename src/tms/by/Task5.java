package tms.by;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число = ");
        int input=scanner.nextInt();
        // 1-рубль, 2-4 - рубля, 5-20 рублей.
        int x = input % 10;
        if (input%100>=11&&input%100<=14)
        { System.out.println(input + " рублей");}
        else if( x==1){

            System.out.println(input + " рубль");}
        else if (x == 2 || x== 3 || x==4 ) {


            System.out.println(input + " рубля");}
        else {System.out.print (input + " рублей");}


    }
}
