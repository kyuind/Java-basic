package Abstract;

public class Bird extends AbsteactAnimal implements Fly,InterfaceA,InterfaceB{
    @Override
    public void sound(){
        System.out.println("짹짹");
    }
    @Override
    public void move(){
        System.out.println("훨훨");
    }
    @Override
    public void fly(){
        System.out.println("슝슝");
    }
    @Override
    public void methodA(){
        System.out.println("A");
    }
    @Override
    public void methodB(){
        System.out.println("B");
    }
    @Override
    public  void methodCommon(){
        System.out.println("common");
    }
}
