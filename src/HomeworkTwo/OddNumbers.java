//Да се изведат на екрана всички нечетни числа от -10 до 10

package HomeworkTwo;

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            if (i % 2 == -1 || i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
