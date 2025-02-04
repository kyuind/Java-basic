package Scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        while(true){
            System.out.print("숫자를 입력해주세요: ");
            int num = scanner.nextInt();

            sum += num;

            if(num ==0){
                System.out.println(sum);
                break;
            }
        }
    }
}
