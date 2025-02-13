package Abstract;

//public  class Caw extends AbsteactAnimal{
public class Caw implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("음메 음메");
    }

    @Override
    public void move(){
        System.out.println("성큼 성큼");
    }
}
