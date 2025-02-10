package Array;
// 배열은 같은 타입의 변수를 묶어서 사용 가능하다.
public class Array2 {
    public static void main(String[] args){
        // 1. 배열 선언 및 생성
        int[] students;
        // 2. 배열 변수 생성
        students = new int[5]; // 5개의 요소로 만들겠다. 값이 자동으로 초기화

        // 배열안에 값을 입력
        students[0] = 80;
        students[1] = 60;
        students[2] = 70;
        students[3] = 90;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);

    }

}
