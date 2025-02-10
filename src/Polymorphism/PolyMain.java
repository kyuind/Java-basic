package Polymorphism;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스를 참조하는 상황
        System.out.println("Parent->Parent");
        Parent parent =new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스를 참조하는 상황
        System.out.println("Child->Child");
        Child child=new Child();
        child.childMethod();

        //부모 변수가 자식 인스턴스를 참조하는 상황(다형적 참조), 업 캐스팅
        System.out.println("Parent->Child");
        Parent poly =new Child();
        poly.parentMethod();
        //poly.childMethod();

        //다운 캐스팅
        Child child11 = (Child) poly;
        child11.childMethod();



    }
}
