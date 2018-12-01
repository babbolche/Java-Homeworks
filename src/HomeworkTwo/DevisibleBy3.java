//Започвайки от 3, да се изведат на екрана първите n числа които се делят на 3. Числата да са разделени със запетая.

package HomeworkTwo;

import java.util.Scanner;

public class DevisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number for n:");
        int n=scanner.nextInt();
        for (int i=3; i<=n; i++) {
            if (i%3 ==0) {
                System.out.print( i + ", ");

            }
        }

    }
}
