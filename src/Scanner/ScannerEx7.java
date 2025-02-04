package Scanner;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력해주세요: ");
            String name = scanner.nextLine();

            System.out.print("나이를 입력해주세요: ");
            int age = scanner.nextInt();


        }
    }
}
