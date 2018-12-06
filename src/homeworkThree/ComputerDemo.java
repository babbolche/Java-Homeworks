/*
Да се създаде клас ComputerDemo, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price,
hardDiskMemory, freeMemory, operationSystem.Нека единият компютър да е
лаптоп. На единия от двата компютъра да се задели памет 100 (чрез
метода useMemory), а на другия, да се смени операционната система (чрез
метода changeOperationSystem), след което да се изведат на екрана всичките
полета на двата компютъра.
 */

package homeworkThree;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setYear(2015);
        computer.setPrice(495.50);
        computer.setHardDiskMemory(2048);
        computer.setFreeMemory(1500);
        computer.setOperationSystem("Linux");
        computer.setNotebook(false);

        System.out.println("The computer is manufactured in " + computer.getYear() + " year.");
        System.out.println("His price was " + computer.getPrice() + " euro.");
        System.out.println("It's HD is " + computer.getHardDiskMemory() + " GB.");
        System.out.println("The free memory is: " + computer.getFreeMemory() + " GB.");
        System.out.println("The OS is " + computer.getOperationSystem());
        System.out.println("Is this a notebook - " + computer.isNotebook);

        computer.useMemory(100);

        Computer laptop = new Computer();
        laptop.setYear(2017);
        laptop.setPrice(795.50);
        laptop.setHardDiskMemory(3500);
        laptop.setFreeMemory(2200);
        laptop.setOperationSystem("Linux");
        laptop.setNotebook(true);

        System.out.println("The computer is manufactured in " + laptop.getYear() + " year.");
        System.out.println("His price was " + laptop.getPrice() + " euro.");
        System.out.println("It's HD is " + laptop.getHardDiskMemory() + " GB.");
        System.out.println("The free memory is: " + laptop.getFreeMemory() + " GB.");
        System.out.println("The OS is " + laptop.getOperationSystem());
        System.out.println("Is this a notebook - " + laptop.isNotebook);

        laptop.changeOperationSystem("Windows");


    }
}
