package Conditional;

public class If4 {
    public static void main(String[] args){
        int price = 11000;
        int age = 19;
        int discount = 0;
        if (price >=10000){
            discount = discount + 1000;
        }

        if (age <= 10){
            discount = discount + 1000;
        }

        System.out.println(discount);

    }
}
