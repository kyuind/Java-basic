package ClassC01;

public class BookMain {
    public static void main(String[] args) {
        // 기본 생성자 사용
        Book book1 = new Book();
        book1.displayInfo();

        // title, author만 있는 생성자
        Book book2 = new Book("어린왕자","생택쥐베리");
        book2.displayInfo();

        // 모든 매개변수 사용
        Book book3 = new Book("나의 라임 오렌지나무","조제무우루",299);
        book3.displayInfo();
    }
}
