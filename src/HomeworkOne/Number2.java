package HomeworkOne;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type A number: ");
        float A = scanner.nextFloat();
        System.out.println("Type  number: ");
        float B = scanner.nextFloat();
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A / B);
        System.out.println(A % B);
        System.out.println(A * B);
    }
}
