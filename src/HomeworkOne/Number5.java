package HomeworkOne;

public class Number5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 8;
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
            if (c > a && c > b) {
                if (b > a) {
                    System.out.println(c + " " + b + " " + a);
                } else {
                    System.out.println(c + " " + a + " " + b);
                }
            }
        }
    }
}
