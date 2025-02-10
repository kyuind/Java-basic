package Class.Memory;

import static Class.Memory.Car.*;

public class CarMain {
    public static void main(String[] args) {
        showTotalSales();
        Car car1 = new Car ("K7");
        Car car2 = new Car("토레스");
        Car car3 = new Car("G바겐");
        Car car4 = new Car("부가티");

        Car.showTotalSales();
    }
}
