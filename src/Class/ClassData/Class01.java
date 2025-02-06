package Class.ClassData;

public class Class01 {
    public static void main(String[] args) {
//============================변수============================
//        String student1Name = "학생1";
//        int student1Age = 15;
//        int student1Grade = 90;
//
//        String student2Name = "학생2";
//        int student2Age = 16;
//        int student2Grade = 80;
//
//        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
//        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
//============================배열============================
        String[] studentName = {"student1","student2"};
        int[] studentAge= {15,16};
        int[] studentGrade = {90,80};

        for (int i =0; i< studentName.length; i++){
            System.out.println("이름:" + studentName[i] + " 나이:" + studentAge[i] + " 성적:" + studentGrade[i]);
        }
    }

}
