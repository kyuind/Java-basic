package operators;

public class Operator2 {
    public static void main(String[] args){
        //문자열 + 문자열
        String result1 = "hello" + "Java";
        System.out.println(result1);

        //문자열 + 숫자 : 숫자를 문자열로 인식.
        String result2 = "a + b = ";
        int num1 = 10;
        System.out.println(result2 + num1);
    }
}
