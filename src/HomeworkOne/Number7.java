package HomeworkOne;

public class Number7 {
    public static void main(String[] args) {
        int hour = 18;
        double money = 23.6;
        boolean healthy = true;
        if (!healthy) {
            System.out.println("If I am not healthy I won`t go out.");
        }
        //if (money > 0 && !healthy) {
           // System.out.println("I have money for medicines.");
        //}
        else {
            System.out.println("I will go out to movie with friends");
        }
        if (money > 0) {
            System.out.println("I have money for medicines.");
        } else {
            System.out.println("I will stay at home and drink tea.");
        }
        if (money < 10) {
            System.out.println("I will go out for a coffee with friends");
        }


    }
}
// на тази задача доста странно ми се струва условието, сякаш нещо лиспва, някой от нещата (поне според мен)
// би могло да се комбинират - там където е в коментар и да се махне долното подобно,
// за да не излиза толкова абсурден аутпут.