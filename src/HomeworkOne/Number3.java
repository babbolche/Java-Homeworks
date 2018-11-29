package HomeworkOne;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick first whole number:");
        int first = scanner.nextInt();
        System.out.println("Pick first whole number:");
        int second = scanner.nextInt();
        int third = first;
        System.out.println(first=second);
        System.out.println(second=third);
    }

}

// без размяна int x = 10; int y = 5;
//x = x + y;
//y = x - y;
//        x = x - y;