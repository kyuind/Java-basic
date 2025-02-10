package Array;

public class Array4 {
    public static void main(String[] args) {
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

        // 변수의 값을 사용  배열의 개수만큼 // 리팩토링
        for (int i=0; i < students.length; i++) {
            System.out.println("학생"+(i+1) + "점수: " + students[i]);
        }
    }
}
