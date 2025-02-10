package Polymorphism;

public class CastingMain1 {
    public static void main(String[] args) {
        Child child = new Child();

        //upcasting
        Parent parent = (Parent) child;

        Parent parent1 = child;

        Parent poly = new Child();

        poly.parentMethod();


        //downcasting

        Child child1 = (Child)poly;

        child1.childMethod();
        ((Child)poly).childMethod();
    }
}
