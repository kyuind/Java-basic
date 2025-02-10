package Class.Ex01;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter  = new MaxCounter(1);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
    }
}
// 우리가 만든 클래스 코드가 클래스 정보이고 '매서드 영역'에 들어간다.
// 매서드에 ㅅㅌㅌ , 상수값 final,
// 프로그램이 실제로 실행되는영역 라스트 인 펄스트 아웃 첨들어가고 마지막에 나옴

// 매서드를 실행할 때 마다. 스택영역에 하나씩 쌓인다.
// 스택 영역이다. 후입선출 LIFO 라스트 인 퍼스트 아웃 / 마지막에 들어온게 먼저 나가라
// 힙은 계층적 구조 순차 적으로 내려감.

// 선입선출은 큐
// 선형 구조 직선으로 표현가능 // 곡선
// 힙은 비 선형적 구조  // 인스턴스가 생성되는 영역(xoo1) + 배열  힙은 결과 값이 나옴

//메서드 스택 힙 // 메모리 구조 3가지

// 메서드는 클래스 정보 (메서드의 class 가 힙영늘어나지 않는다.
// 실행은 스택(매서드 실행) 매서드는 실행 -> 객체 생성
// 관리는 힙 (가비지 컬랙션(사용하지 않는 메모리)이 지워주는 영역이 힙이다.)