package HomeworkOne;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number: ");
        int a1 = scanner.nextInt();
        System.out.println("Type second number: ");
        int a2 = scanner.nextInt();
        System.out.println("Type third number: ");
        int a3 = scanner.nextInt();
        int a4 = a1;
        System.out.println(a1 = a2);
        System.out.println(a2 = a3);
        System.out.println(a3 = a4);
    }
}
