package Array;

public class Array05 {
    public static void main(String[] args) {
        int[] students; //변수 선언
        students = new int[]{80,60,70,90,50}; //배열 생성 및 초기화

      // int[] students = new int[]{80,60,70,90,50}; 선언 및 생성 및 초기화
      // int[] students = {80,60,70,90,50}; 생략 가능

        for(int i =0; i < students.length; i++){
            System.out.println("학생"+(i+1)+" 점수: "+students[i]);
        }
    }
}
