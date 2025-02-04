package Scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        while(true) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 ==0 ){
                System.out.println("동작을 정지합니다.");
                break;
            }

            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);


        }
    }
}
