package Array;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};
        int max=0;

        for (int i =0; i < students.length; i++){
            if (students[i]> max) {
                max = students[i];
            }
        }
        System.out.println(max);
    }
}
