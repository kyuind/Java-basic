package Array;

public class Array6 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 학생 점수 배열
        int sum = 0;

        for (int i=0; i < students.length; i++) {
            sum += students[i];
        }
        double avg = (double) sum /students.length;
        System.out.println(avg);
    }
}
