package Abstract;

//public class Cat extends AbsteactAnimal{
public class Cat implements InterfaceAnimal{

    @Override
    public void sound(){
        System.out.println("야옹 야옹");
    }

    @Override
    public void move(){
        System.out.println("살금살금");
    }
}
