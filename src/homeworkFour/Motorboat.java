package homeworkFour;

public class Motorboat {
    private int year;
    private double price;

    public Motorboat(int year, double price) {
        this.year = year;
        this.price = price;
    }

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

    public void leaveShip() {
        System.out.println("Motorboat leaves the ship.");
    }

    public void getInShip() {
        System.out.println("Motorboat get in the ship.");
    }
}
