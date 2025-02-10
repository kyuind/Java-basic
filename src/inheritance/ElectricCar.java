package inheritance;

public class ElectricCar extends Car {
//    public void move(){
//        System.out.println("이동");
//    }

    public void charge(){
        System.out.println("충전");
    }

    @Override
    public void move(){
        System.out.println("매우 빠르게 이동");
    }
}
