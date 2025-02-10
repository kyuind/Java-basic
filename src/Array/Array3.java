package Array;
import java.util.Scanner;
// 기본형은 값을 지정을 해줌.
public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size = scanner.nextInt();
        // 참조형이 데이터를 저장하는 방식 동적 메모리 할당
        array = new int[size];
        System.out.println(array.length);
    }
}
