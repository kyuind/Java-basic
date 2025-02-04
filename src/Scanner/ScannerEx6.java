package Scanner;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            int ex;
            ex = num1;
            num1 = num2;
            num2= ex;
        }

        for(int i = num1; i<= num2; i++){
            System.out.print(i+",");
        }


    }
}
