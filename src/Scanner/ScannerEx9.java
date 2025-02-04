package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;
        while(true) {
            System.out.print("숫자를 입력해주세요: ");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            total += num;
            count++;
        }
        double average = total/count;
        System.out.println(total);
        System.out.println(average);
        }

}

