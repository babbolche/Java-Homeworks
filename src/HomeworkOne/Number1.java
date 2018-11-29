package HomeworkOne;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type A number: ");
        double A = scanner.nextInt();
        System.out.println("Type B number: ");
        double B = scanner.nextInt();
        System.out.println("Type C number: ");
        double C = scanner.nextInt();
        if (A > C || B > C) {
            System.out.println("Number " + C + " is between " + A + " and " + B);
        } else {
            System.out.println("Number " + C + " is not between " + A + " and " + B);
        }

    }
}
