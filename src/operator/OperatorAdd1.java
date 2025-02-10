package operator;

public class OperatorAdd1 {
    public static void main(String[] args){
        int a = 0;

        a += 1;
//      a = a + 1;

        System.out.println(a);
        a += 1;
        System.out.println(a);

        // 증감연산
        ++a; // a = a + 1;
        System.out.println(a);
        --a; // a = a - 1;
        System.out.println(a);

    }
}
