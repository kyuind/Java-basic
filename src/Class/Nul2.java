package Class;

public class Nul2 {
    public static void main(String[] args) {
        Data data = null; // 참조값이 없는 상태
        data.value = 10; // NullPointerException 없는 값을 참조함. 값이 안들어감.
        System.out.println(data.value);
    }
}
