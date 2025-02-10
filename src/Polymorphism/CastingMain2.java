package Polymorphism;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent;
        child.childMethod();

        ((Child)parent).childMethod();

        //runtime error 실행에서 에러가 나는 상황
        Parent parent1 = new Parent();
        Child child1 = (Child) parent1; //ClassCastException 예외
        child1.childMethod();


    }
}
