package scope;

public class Scope01 {
    public static void main(String[] args) {
        int m = 10;
        if (true){
            int x = 30;
            System.out.println(m);
            System.out.println(x);
        }
        System.out.println(m);
        // System.out.println(x); 사용 불가
    }
}
