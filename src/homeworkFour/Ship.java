/*
Build a Ship. Every ship must have length, width, name, year, price and motorboat.
It can move fast in sea, move slow, and park on the coast.
Motorboat is a separate object.
Every motorboat must have year and price, and 2 actions - leaveShip and getInShip.

Create constructors with all the fields of the two objects.
Create 2 Ships with their motorboats.
Make the motorboats leave and get in ship. Make the ships run fast,
after that run slow and finally park.
 */

package homeworkFour;

public class Ship {
    private String name;
    private int length;
    private int width;
    private int year;
    private double price;
    private Ship motorboat;

    public Ship(String name, int length, int width, int year, double price, Ship motorboat) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.year = year;
        this.price = price;
        this.motorboat = motorboat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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

    public Ship getMotorboat() {
        return motorboat;
    }

    public void setMotorboat(Ship motorboat) {
        this.motorboat = motorboat;
    }

    public void navigateFastInSea() {
        System.out.println(name + " can navigate fast in sea.");
    }

    public void navigateSlowInSea() {
        System.out.println(name + " can navigate slow in sea.");
    }

    public void parkOnTheCoast() {
        System.out.println(name + " is already parked on the coast.");
    }
}
