package homeworkFour;

public class ShipMotorboatDemo {
    public static void main(String[] args) {
        Motorboat veneziaMototorboat = new Motorboat(1988, 495.99);
        Ship venezia = new Ship("Venezia", 20, 10, 1086, 7999.99, veneziaMototorboat);
        veneziaMototorboat.leaveShip();
        veneziaMototorboat.getInShip();
        venezia.navigateFastInSea();
        venezia.navigateSlowInSea();
        venezia.parkOnTheCoast();

        Motorboat freedomMotorboat = new Motorboat(2010, 100099.99);
        Ship freedom = new Ship("Freedom", 10, 6, 2014, 289999.99, freedomMotorboat);
        freedomMotorboat.leaveShip();
        freedomMotorboat.getInShip();
        freedom.navigateSlowInSea();
        freedom.navigateFastInSea();
        freedom.parkOnTheCoast();
    }
}
