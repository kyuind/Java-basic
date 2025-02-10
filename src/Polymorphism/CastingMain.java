package Polymorphism;

public class CastingMain {
    public static void main(String[] args) {
        // 부모 타입의 변수가 자식인스턴스를 참조..업 캐스팅 ( 다형적 참조)
        Parent poly = new Child();

//        poly.childMethod();
        //일시적 다운 캐스팅
        ((Child) poly).childMethod();

    }
}
