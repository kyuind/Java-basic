package Conditional;

public class CondOp2 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);

        int num3 = 7;
        String result = (num3 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);

        int num4 = 0;
        String result2 = (num4 > 0) ? "양수" : (num4 < 0 ) ? "음수" : "0";
        System.out.println(result2);
    }
}
