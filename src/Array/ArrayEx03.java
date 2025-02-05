package Array;

import java.util.Scanner;

public class ArrayEx03 {
    public static void main(String[] args) {
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

        for(int j =size; j >=arr.length; j--){
            System.out.println(arr[j]);
        }
    }
}
