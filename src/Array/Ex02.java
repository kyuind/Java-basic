package Array;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 사이즈를 입력하시오 : ");
        int size = scanner.nextInt();

        int[]arr = new int[size];
        int i = size;
        for(int num : arr) {
            num = i;
            System.out.print(num);
            if(num != 1){
                System.out.print(", ");
            }
            i--;
        }

    }
}
