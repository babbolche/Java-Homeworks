//Да се прочете число от екрана(конзолата) и да се изведе сбора на всички числа между 1 и въведеното число

package HomeworkTwo;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:" );
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum=sum +i;
        }
        System.out.println(sum);
    }
}
