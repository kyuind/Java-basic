package Scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();

        System.out.print("수량을 입력해주세요: ");
        int num = scanner.nextInt();

        int price = 10000;
        int total = price * num;

        System.out.println(foodName+num+"개를 주문하셨습니다. 총가격은 "+ total+"원 입니다.");

    }
}
