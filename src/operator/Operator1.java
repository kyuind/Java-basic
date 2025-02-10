package operator;

public class Operator1 {
    public static void main(String[] args){
        int a = 5 , b =2;

        // plus
        int sum = a + b;
        System.out.println("a+b= " + sum);
        //

        int diff = a - b;
        System.out.println("a-b= " + diff);

        int multi = a * b;
        System.out.println("a*b= " + multi);

        int div = a / b;
        System.out.println("a / b= " + div); // 5 / 2 = 2  int 여서 2.5 가아닌 2

        int mod = a % b;
        System.out.println("a % b= " + mod); // 5 % 2 = 1
    }
}
