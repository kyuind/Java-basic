package Abstract;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceA a =new InterfaceChild();
        a.methodA();
        a.methodCommon();

        InterfaceB b =new InterfaceChild();
        b.methodB();
        b.methodCommon();
    }
}
