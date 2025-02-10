package Conditional;

public class CondOp4 {
    public static void main(String[] args){
        int num = 0;
        String result = (num > 0) ?"양수" :(num < 0) ? "음수" :"0";
        System.out.println("숫자" + num + "는" + result);
    }
}
