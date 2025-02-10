package Class.Ex01;

public class MaxCounter {
    private int count = 0;
    private int max = 0;

    // 생성자 : 최대값 설정
    public MaxCounter(int max){
        this.max = max;
    }
    // 카운트를 증가하는 메서드
    public void increment(){
        if(count >= max){ // 카운트가 맥스보다 크면
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++; // 1씩 증가
    }
    // 카운트반환값
    public int getCount(){
        return count;
    }
}
