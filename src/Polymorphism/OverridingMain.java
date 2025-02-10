package Polymorphism;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child1 child1 = new Child1();
        System.out.println("Child->Child");
        System.out.println("value = "+child1.value);
        //부모 변수가 부모 인스턴스 참조
        Parent1 parent1 = new Parent1();
        System.out.println("Parent->Parent");
        System.out.println("value = "+parent1.value);
        //부모 변수가 자식 인스턴스 참조(다형성 참조)
        Parent1 poly = new Child1();
        System.out.println("Parent->Child");
        System.out.println("value= "+poly.value);
        poly.method();
    }
}
