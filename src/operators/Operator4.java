package operators;

public class Operator4 {
    public static void main(String[] args){
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = "+ a + ", b= "+ b);

        a = 1;
        b = 0;

        b = a++; // a가 b에 먼저 대입되고 이후 a를 증가
        System.out.println("a = "+ a + ", b= "+ b);

        a = 1 ;
        ++a;
        System.out.println(a);

        a++;
        System.out.println(a);
    }
}
