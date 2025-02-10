package Class.Memory;

public class MemoryMain2 {
    public static void main(String[] args) { // 스택프레임 메인 메서드실행
        System.out.println("MemoryMain start");
        method1(); // 메소드1 호출
        System.out.println("MemoryMain end");
    }
    static void method1(){ //스택프레임 생성
        System.out.println("MemoryMain.method1 start");
        Data data1 = new Data(10); // 인스턴스 생성 // 힙에 value 10생성
        method2(data1);
        System.out.println("MemoryMain.method1 end");
    }
    static void method2(Data data2){
        System.out.println("MemoryMain.method2 start");
        System.out.println("data.value ="+data2.getValue()); // 10
        System.out.println("MemoryMain.method2 end");
    }
}
//메서드 스택 힙 // 메모리 구조 3가지

// '메서드'는 클래스 정보 (메서드의 class 가 힙영늘어나지 않는다.
// 실행은 '스택'(매서드 실행) 매서드는 실행 -> 객체 생성
// 관리는 '힙' (가비지 컬랙션(사용하지 않는 메모리)이 지워주는 영역이 힙이다.)
// new 키워드 객체와 저장
// 스태택 (정적이다)정적변수 , 클래스변수 , 스태틱변수 다 같은말
// 다 같이 참조값을 사용하겠다.