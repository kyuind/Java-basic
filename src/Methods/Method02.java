package Methods;

public class Method02 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 동작중");
        printFooter();

    }

    public static void printHeader (){
        System.out.println("===프로그램 시작===");
        return; // 생략 가능(void일 경우)
    }

    public static void printFooter(){
        System.out.println("===프로그램 종료===");
        return;
    }
}
