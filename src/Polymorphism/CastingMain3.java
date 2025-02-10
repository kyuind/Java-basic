package Polymorphism;

public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent 호출");
        call(parent);

        Parent parent1 = new Child();
        System.out.println("Parent1 호출");
        call(parent1);

    }

    public static void call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child){
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
