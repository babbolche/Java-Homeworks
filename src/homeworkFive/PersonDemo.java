package homeworkFive;

public class PersonDemo {
    public static void main(String[] args) {

        Person magi = new Person("Magi", 22, false);
        magi.showPersonInfo();

        Person koko = new Person("Koko", 19, true);
        koko.showPersonInfo();

        Student eli = new Student("Eli", 19, false, 5.66);
        eli.showStudentInfo();

        Student gosho = new Student ("Gosho", 21, true, 4.22);
        gosho.showStudentInfo();

        Employee peter = new Employee("Peter", 30, true, 53.20);
        peter.calculateOvertime(3);
        peter.showEmployeeInfo();

        Employee maria = new Employee("Maria", 26, false, 44.50);
        maria.calculateOvertime(2);
        maria.showEmployeeInfo();



    }
}
