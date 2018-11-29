package HomeworkOne;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick whole number:" );
        int A = scanner.nextInt();
        System.out.println("Pick one more whole number:" );
        int B = scanner.nextInt();
        if (A > B) {
            System.out.println(B + " " + A);
        } else {
            System.out.println(A + " " + B);
        }
    }
}
