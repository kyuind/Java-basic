package Class;

public class ChangeMethod {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("매서드 호출 전: "+a);
        changePrimitive(a);
        System.out.println("매서드 호출 후: "+a);
    }
    static void changePrimitive(int a){
        a = 20;
    }
}
