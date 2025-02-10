package Class.Memory;

public class MemoryMain {
    public static void main(String[] args) { // 스택프레임 메인 메서드실행
        System.out.println("MemoryMain start");
        method1(10); // 메소드 10 실행시킴
        System.out.println("MemoryMain end");
    }
    static void method1(int m1){ //스택프레임 생성
        System.out.println("MemoryMain.method1 start");
        int cal = m1 *2;
        method2(cal);
        System.out.println("MemoryMain.method1 end");
    }
    static void method2(int m2){
        System.out.println("MemoryMain.method2 start");
        System.out.println("MemoryMain.method2 end");
    }
}
//메서드 스택 힙 // 메모리 구조 3가지

// '메서드'는 클래스 정보 (메서드의 class 가 힙영늘어나지 않는다.
// 실행은 '스택'(매서드 실행) 매서드는 실행 -> 객체 생성
// 관리는 '힙' (가비지 컬랙션(사용하지 않는 메모리)이 지워주는 영역이 힙이다.)