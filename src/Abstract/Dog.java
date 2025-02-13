package Abstract;

import javax.swing.plaf.SpinnerUI;

//public class Dog extends AbsteactAnimal {
public class Dog implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }

    @Override
    public void move(){
        System.out.println("뽀짝뽀짝");
    }
}
