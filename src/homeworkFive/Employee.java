package homeworkFive;

public class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public void calculateOvertime(double hours) {
        if (getAge() < 18) {
            System.out.println("No need for payment");
        } else {
            double calculateOvertime;
            double hourSalary = (daySalary / 8) * 1.5;
            calculateOvertime = hours * hourSalary;
            System.out.println(calculateOvertime);
        }
    }

    public void showEmployeeInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Is male: " + isMan());
        System.out.println("Day salary: " + daySalary);
    }
}
