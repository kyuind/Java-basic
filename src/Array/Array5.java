package Array;

public class Array5 {
    public static void main(String[] args){
        int [] students; // 변수 선언
        students = new int[]{80,60,70,90,50}; // 배열 생성과 초기화를 동시에 해줌.

//        int[] students = new int[]{80,60,70,90,50};
//        int[] students = {80,60,70,90,50};

        //변수의 값을 사용
        for (int i=0; i < students.length; i++){
            System.out.println("학생"+(i+1) + "점수:" + students[i]);
        }
    }
}
