package inheritance;

import javax.swing.event.HyperlinkEvent;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        Hydrogen hydrogen = new Hydrogen();
        hydrogen.move();
        hydrogen.fillHydrogen();
        hydrogen.openDoor();
    }
}
