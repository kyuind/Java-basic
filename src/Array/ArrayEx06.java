package Array;

import java.util.Scanner;

public class ArrayEx06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 최대 저장 개수 입력
        int maxProducts =10;
        // 배열 생성
        String[][] productArray = new String[10][2];

        // 배열 행 순서 정하는 번호
        int cnt= 0;

        while(true){
            System.out.print("1: 상품입력 2: 상품목록 3: 종료 [입력해주세요] ");
            int type = scanner.nextInt();


            if(type ==1){
                scanner.nextLine(); //초기화 필요. nextInt 값을 받고 들어온 경우 버퍼 초기화 필수 !

                System.out.print("상품명을 입력하세요 : ");
                String productName = scanner.nextLine();
                System.out.print("가격을 입력하세요 : ");
                String productPrice = scanner.nextLine();

                System.out.println(" 입력이 완료되었습니다.");
                productArray[cnt][0] = productName;
                productArray[cnt][1] = productPrice;
                cnt++;

            } else if(type ==2){
                for (int i =0; i < cnt; i++){
                    System.out.print("상품명 : "+ productArray[i][0]+" ");
                    System.out.println("가격 : "+ productArray[i][1]+"원");
                    System.out.println();
                }
            } else if (type ==3) {
                System.out.println("종료");
                break;
            } else{
                System.out.println("더 이상 입력할 수 없습니다.");
            }
        }

    }
}
