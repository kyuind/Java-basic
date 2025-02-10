package Class;

public class Null {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("Null data :" + data);
        data = new Data(); // x001
        System.out.println("New data : " + data);
        data = null; // 아무것도 없는 객체를 넣음
        System.out.println("re Null data : " +data);
    }
}
