package operators;

public class Operator6 {
    public static void main(String[] args){
        String str1 = "문자열1";
        String str2 = "문자열1";

        boolean result1 = str1 == str2; // 부정확함
        boolean result2 = str1.equals(str2); // String은 클래스 속성 equals 사용

        System.out.println(result1);
        System.out.println(result2);
    }
}
