package Array;

import java.util.Scanner;

public class ArrayEx02 {
    public static void main(String[] args) {
        // 사용자에게 숫자를 입력 받아서
        // 연속되는 숫자로 채워진 배열을 생성
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];

        int i=1;

        for(int num : arr){
            num = i;
            System.out.print(num);
            if(num != arr.length){
                System.out.print(", ");
            }
            i++;
        }


    }
}
