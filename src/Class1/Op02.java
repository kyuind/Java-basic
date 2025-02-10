package Class1;

public class Op02 {
    public static void main(String[] args) {
        // 인스턴스를 생성하고 인스턴스가 참조값을 가져옴참조값을 다시 받아와서 사용 (초기화완료)
        ObjectValue data = new ObjectValue();
        data.add(5);
        data.add(2);
        data.add(-3);
        System.out.println("최종숫자 =" + data.value); //3
    }

}
