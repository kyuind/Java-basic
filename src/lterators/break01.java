package lterators;

public class break01 {
    public static void main(String[] args) {
        // 수열 코드를 조건을 특정 변수의 크기보다 전체의 합이 크면 정지
        int inc =1;
        int total = 0;
        int stop = 100;
        while (true){
            total += inc;

            if (total >= stop){
                System.out.println(total);
                System.out.println(inc);
                break;
            }
            inc++;
        }

    }
}
