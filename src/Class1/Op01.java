package Class1;

public class Op01 {
    public static void main(String[] args) {
        // 인스턴스를 생성하고 인스턴스가 참조값을 가져옴참조값을 다시 받아와서 사용 (초기화완료)
        Data data = new Data();
        add(data); // x001.value 를 1증가
        add(data); // x001.value 를 1증가
        add(data); // x001.value 를 1증가
        System.out.println("최종숫자 =" + data.value); //3
    }

    static void add(Data data){
        data.value++; // 매서드를 만듬
        System.out.println("숫자 증가 : value = "+data.value);
    }

}
