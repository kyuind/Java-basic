package Array;

import java.util.Scanner;

public class ArrayEx04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요. : ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];



        System.out.println("입력받은 숫자 : "+num);
        for( int i = 0; i <num; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for(int i =0; i <numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
