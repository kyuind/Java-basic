package Array;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        // 사용자에게 숫자를 입력받아서
        // 연속되는 숫자로 채워진 배열을 생성
        // 입력값: 6 배열사이즈가 6 값은 123456
        // 출력할건데 각 원소마다 , 로 구분
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 사이즈를 입력하시오 : ");
        int size = scanner.nextInt();

        int[]arr = new int[size];
        int i =1;
        for(int num : arr) {
            num = i;
            System.out.print(num);
            if(num != arr.length){
                System.out.println(", "+ num);
            }
            i++;
        }

    }
}
