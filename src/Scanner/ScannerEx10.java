package Scanner;

import java.util.Scanner;

public class ScannerEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice =0;

        while(true){
            System.out.print("1: 상품명 2: 결제 3: 종료 [입력해주세요] ");
            int type = scanner.nextInt();

            if(type ==1){
                scanner.nextLine(); //초기화 필요. nextInt 값을 받고 들어온 경우 버퍼 초기화 필수 !

                System.out.print("상품명을 입력하세요 : ");
                String product = scanner.nextLine();

                System.out.print("가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("수량을 입력하세요 : ");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;

                System.out.println("======결제 정보======");
                System.out.println("상품 : "+product);
                System.out.println("가격 : "+price+"원");
                System.out.println("수량 : "+quantity+"개");
                System.out.println("합계 : "+(price*quantity)+"원");
                System.out.println("===총 결제 금액 :"+totalPrice+"원===");

            } else if(type ==2){
                System.out.println("총비용 : " + totalPrice+"원");

                totalPrice = 0;
            } else if (type ==3) {
                System.out.println("결제 완료");
                break;
            } else{
                System.out.println("다시 입력해주세요.");
            }
        }

    }
}
