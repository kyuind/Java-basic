package Class.Memory;

public class DataCountMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data1 data1 = new Data1("A",counter);
        System.out.println("A count= " + counter.count); // 1

        Data1 data2 = new Data1("A",counter);
        System.out.println("A count= " + counter.count); // 2

        Data1 data3 = new Data1("A",counter);
        System.out.println("A count= " + counter.count); // 3
        System.out.println("A count= " + counter.count);
        System.out.println("A count= " + counter.count);
        // 외부객체를 사용해서 만듬 x005라는 같은것을 보고있다.
    }
}
