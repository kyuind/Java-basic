package Scanner;

import java.util.Scanner;

public class ScannerEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice =0;
        while(true){
            System.out.print("1: 상품명 2: 결제 3: 종료 [입력해주세요] ");
            int option = scanner.nextInt();



            if(option ==1){
                scanner.nextLine(); //초기화 필요.

                System.out.print("상품명을 입력하세요 : ");
                String product = scanner.nextLine();

                System.out.print("가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("수량을 입력하세요 : ");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;

                System.out.println(product + "를 총 "+ quantity+ "개 구매합니다." );
            } else if(option ==2){
                System.out.println("총비용 : " + totalPrice);

                totalPrice = 0;
            } else if (option ==3) {
                System.out.println("결제 완료");
                break;
            } else{
                System.out.println("다시 입력해주세요.");
            }
        }

    }
}
