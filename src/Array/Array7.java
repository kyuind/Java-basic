package Array;

public class Array7 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 학생 점수 배열

        // 최댓값을 찾기.
        int maxValue = 0; // maxValue
        for (int i=0; i < students.length; i++) {
            if(students[i] > maxValue){
                maxValue = students[i];
            }
        }
        System.out.println(maxValue);
    }
}
