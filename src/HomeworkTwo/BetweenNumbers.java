package HomeworkTwo;

import java.util.Scanner;

public class BetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = scanner.nextInt();
        System.out.println("Type one more number: ");
        int b = scanner.nextInt();
        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
        }
    }
}
