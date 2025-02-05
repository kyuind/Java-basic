package Array;

import java.util.Scanner;

public class ArrayEx05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("행의 개수 입력 : ");
        int x= scanner.nextInt();
        System.out.print("열의 개수 입력 : ");
        int y= scanner.nextInt();
        int[][] num = new int[x][y];

        System.out.println("입력 받을 숫자 : " +(x*y));

        for(int i =0;i <x; i++ ){
            for(int j = 0; j <y; j++){
                num[i][j] = scanner.nextInt();
            }
        }
        int max = num[0][0];
        int min = num[0][0];

        for(int i = 0; i<x; i++){
            for(int j=0; j<y; j++){
                if(num[i][j]>max){
                    max=num[i][j];
                }
                if(num[i][j]<min){
                   min=num[i][j];
                }
            }
        }

        System.out.println("최고 숫자 : "+ max);
        System.out.println("최소 숫자 : "+ min);

    }
}
// 왜 안돼 ?