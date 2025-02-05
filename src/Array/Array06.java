package Array;

public class Array06 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};
        int sum=0;

        for( int i =0; i < students.length; i++){
            System.out.println(students[i]);
            sum += students[i];
        }

        double average = sum/students.length;

        System.out.println(average);
    }
}
