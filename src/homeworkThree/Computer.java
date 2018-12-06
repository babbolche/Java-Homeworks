/*
Създайте клас Computer, който представя компютър.
Класът да има следните полета:
year – числова стойност показваща година на производство на компютъра
price – числова стойност (не е задължително да е цяло число) показваща
цената на компютъра
isNotebook – булева стойност – дали компютъра е преносим или не
hardDiskMemory – числова стойност за размера на хардиска
freeMemory – числова стойност показваща размера на свободната памет
operationSystem – текстово поле за операционната система на компютъра
Класът да дефинира следните методи:
-метод void changeOperationSystem(String newOperationSystem), който сменя
стойността на полето operationSystem със стойността подадена като
параметър.
-метод void useMemory(double memory), който намалява свободната памет
(freeMemory) със стойността подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет, извеждa съобщение "Not enough free memory!"
*/

package homeworkThree;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    double freeMemory;
    String operationSystem;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public int getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setHardDiskMemory(int hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(double freeMemory) {
        this.freeMemory = freeMemory;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("The new operation system is: " + newOperationSystem);
    }

    void useMemory(double memory) {
        if (freeMemory < memory) {
            System.out.println("Not enough free memory!");
        } else {
            double remainingMemory = freeMemory - memory;
            System.out.println("The remaining memory is: " + remainingMemory);

        }
    }

}
