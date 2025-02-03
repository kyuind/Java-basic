package operators;

public class Operator1 {
    public static void main(String[] args){
        int a = 5 , b = 2;

        //plus
        int sum = a + b;
        System.out.println("a + b = "+ sum); //7

        //minus
        System.out.println(a - b); //3

        //multi
        System.out.println(a * b) ; //10

        //division
        int div = a/b;
        System.out.println("a / b = "+ div); //2

        //mod
        int mod = a%b;
        System.out.println("a % b = "+ mod); //1
    }
}
