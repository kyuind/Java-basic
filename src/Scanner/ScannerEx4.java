package Scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("단수를 정해주세요 : ");
        int num = scanner.nextInt();

        for(int i =1; i<10; i++){
            System.out.println( num + "x" + i + " = "+(num*i));
        }
    }
}
