package Conditional;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args){ // for 문은 반복횟숫가 지정 While 수가 무한반복
        Scanner scanner = new Scanner(System.in); // 종료전까지 반복

        // 1. 정보 저장
        int totalPrice = 0; // 초기화가 되지 않도록 while문 밖에다가 써준다.

        while (true){
            System.out.println("------상품 구매 프로그램------");
            System.out.println("1: 상품입력 2: 결제 3: 프로그램 종료");

            //사용자 입력
            int selectNum = scanner.nextInt();


            // 사용자 입력에 따른 조건 선택
            if(selectNum == 1){   // 조건중 하나를 선택해야 하기 때문에 else if
                scanner.nextLine(); //이전 입력된 줄바꿈 문자 제거용


                System.out.print("상품명을 입력하시오. : ");
                String product = scanner.nextLine();

                System.out.print("가격을 입력하시오. : ");
                int price = scanner.nextInt();

                System.out.println("수량을 입력하시오. : ");
                int cnt = scanner.nextInt();

                totalPrice += price * cnt;
                System.out.println("===결제정보===");
                System.out.println("상품: " + product);
                System.out.println("가격: " + price);
                System.out.println("수량: " + cnt);
                System.out.println("합계: " + (price * cnt));
                System.out.println("*** 총 결제 금액 :" + totalPrice + "***");
            }else if (selectNum == 2) {
                System.out.println("총 결제 금액 : " + totalPrice);
                totalPrice = 0; //결제 완료 후 초기화

            } else if (selectNum == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 값을 입력하시오.");
            }

        }

    }
}
