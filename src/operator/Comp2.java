package operator;

public class Comp2 {
    public static void main(String[] args){
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = str1 == str2; // 부정확함
        boolean result2 = str1.equals(str2);

        System.out.println(result1); // false
        System.out.println(result2); // false
    }
}
