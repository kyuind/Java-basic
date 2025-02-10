package variables;

public class Var8 {
    public static void main(String[] args){
        // 정수
        byte a = 127;
        System.out.println(a);
        short b = 32767;
        System.out.println(b);
        int c = 2147483647;
        System.out.println(c);
        long d = 9223372036854775807L;
        System.out.println(d);
        //실수
        float e = 3.14f; // 4byte 정도 까지 표현(소수점 7자리 정밀도)
        double f = 3.14; // 8byte 정도 까지 표현 (소수점 15자리 정밀도)
        // 자바에서는 double 이 기본형이다.
    }
}
