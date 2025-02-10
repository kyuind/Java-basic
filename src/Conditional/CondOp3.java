package Conditional;

public class CondOp3 {
    public static void main(String[] args){
        int num = 7;
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("숫자" + num + "는" + result);
    }
}
