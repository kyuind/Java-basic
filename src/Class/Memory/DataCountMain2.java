package Class.Memory;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A");
        System.out.println("A count= " + data1.count); // 1

        Data2 data2 = new Data2("A");
        System.out.println("A count= " + data2.count); // 2

        Data2 data3 = new Data2("A");
        System.out.println("A count= " + data3.count); // 3
        // 인스턴스에서 스태틱 변수를 접근


        System.out.println(Data2.count); // 클래스에서 접근 0(올바른 접근)
        // 외부객체를 사용해서 만듬 x005라는 같은것을 보고있다.
        // 변수를 공유 public static add 어디서든 모두 공유를 하겠다.
        // 스태택이 안붙어있으면 인스턴스 스태택변수
    }
}
