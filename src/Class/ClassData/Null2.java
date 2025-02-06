package Class.ClassData;

public class Null2 {
    public static void main(String[] args) {
        Data data = null; // 참조값이 없는 상태
        data.value = 10;  //NullPointerException
        System.out.println(data.value);
    }
}
