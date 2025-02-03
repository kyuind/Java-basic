package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte a= 127;
        short s = 32767;
        int i = 2147483647; // 정수 기본형
        long l = 9223372036854775807L; // L 뒤에 안붙이면 int로 인식
        long l2= 333;
        System.out.println(a);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(l2);

        //실수
        float f = 3.14f;  // 4byte 표현 (소주점 7자리 정밀도)
        double d = 3.14;  // 8byte 표현 (소수점 15자리 정밀도)
        System.out.println(f);
        System.out.println(d);

    }
}
