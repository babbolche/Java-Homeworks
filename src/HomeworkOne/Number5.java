package HomeworkOne;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick whole number:");
        int a = scanner.nextInt();
        System.out.println("Pick one more whole number:");
        int b = scanner.nextInt();
        System.out.println("And one more whole number:");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }

        }
        if (b > a && b > c) {
            if (a > c) {

            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }
        if (c > a && c > b) {
            if (b > a) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        }
    }
}


