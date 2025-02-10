package Array;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // 사용자가 입력을 받을 수 있는 클래스

        System.out.print("배열의 크기 지정 : "); // "배열의 크기 지정 : " 출력함.
        int size = scanner.nextInt(); // 사용자가 입력한 크기만큼 배열생성
        int[] arr = new int[size]; // int[]arr 배열을 만듬 입력받은 size 크기의 정수 배열을 동적으로 생성.
        int[] arr2 = new int[3]; // 앞 선언 뒤 생성
        // 배열 값 입력
        for (int i=0; i <size; i++){ //
            int num = scanner.nextInt(); // 배열을 각 칸에 사용자가 입력을 저장
            arr[i] = num;  // 입력받은 값을 배열에 저장
        }

        // 최소 최대값 구하기
            int minNum = arr[0]; // 배열의 첫 번째 값을 최소값(min)으로 설정
            int maxNum = arr[0]; // 배열의 첫 번째 값을 최대값(max)으로 설정

            for (int number : arr ){ //배열의 모든 요소를 하나씩 가져와서(number) 비교
            if(number < minNum){
                minNum = number;
            }
            if(number > maxNum){
                maxNum = number;
            }
        }
            System.out.print("최소값" + minNum);
            System.out.print("최대값" + maxNum);

    }
}
