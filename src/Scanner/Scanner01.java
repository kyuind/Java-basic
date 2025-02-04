package Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 클래스 선언

        System.out.print("문자열을 입력하시오: ");
        String str = scanner.nextLine(); //String으로 입력을 받음
        System.out.println("입력한 문자열 " + str);

        System.out.print("정수를 입력하시오: "); //정수로 입력
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 " + intValue);

        System.out.print("실수를 입력하시오: "); //실수로 입력
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 " +doubleValue);

    }
}
