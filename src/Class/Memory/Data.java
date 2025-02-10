package Class.Memory;

public class Data {
    private int value;

    public Data(int value){
        this.value = value;
    }
    public  int getValue(){
        return value;
    }
}
//메서드 스택 힙 // 메모리 구조 3가지

// '메서드'는 클래스 정보 (메서드의 class 가 힙영늘어나지 않는다.
// 실행은 '스택'(매서드 실행) 매서드는 실행 -> 객체 생성
// 관리는 '힙' (가비지 컬랙션(사용하지 않는 메모리)이 지워주는 영역이 힙이다.)
// new 키워드 객체와 저장
// 스태택 (정적이다)정적변수 , 클래스변수 , 스태틱변수 다 같은말
// 다 같이 참조값을 사용하겠다.