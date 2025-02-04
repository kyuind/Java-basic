package scope;

public class Casting02 {
    public static void main(String[] args) {
        double doubleValue= 1.5;
        int intValue =0;

        //intValue = doubleValue; // 문제가 있음
        intValue = (int) doubleValue;// 명시적 형변환
        System.out.println(intValue);
    }
}
