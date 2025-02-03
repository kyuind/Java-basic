package operators;

public class Operator3 {
    public static void main(String[] args){
        int a = 0 ;

        a += 1; // a= a + 1
        System.out.println("a = " + a);
        a += 1;
        System.out.println("a = " + a);

        //증감 연산
        ++a; // a = a + 1
        System.out.println("a = " + a);
        --a; // a -1
        System.out.println("a = " + a);
    }
}
