package Class.ClassData;

public class ChangeMethod2 {
    public static void main(String[] args) {
        Data dataA = new Data(); // data 인스턴스
        dataA.value= 10; // Data 인스턴스의 value 속성에 값 입력
        System.out.println("메서드 호출 전: "+ dataA.value); // 10
        changeRef(dataA);
        System.out.println("메서드 호출 후: "+ dataA.value); // 20
    }
    static void changeRef(Data dataX){
        dataX.value = 20;
    }
}
