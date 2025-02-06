package Class.ClassData;

public class Class02 {
    public static void main(String[] args) {
        Student student = new Student(); //클래스 불러오기
        student.name = "학생1";
        student.age = 16;
        student.grade = 90;

        Student student1;//클래스 선언
        student1 = new Student(); //클래스 생성
        student1.name = "학생2";
        student1.age = 15;
        student1.grade = 80;

        Student[] students = new Student[2];
        students[0] = student;
        students[1] = student1;

        for (int i = 0; i<students.length; i++){
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
        for (int i = 0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
        for (Student s : students){
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
//      System.out.println("이름:" + x001.name + " 나이:" + x001.age + " 성적:" + x001.grade);
//      System.out.println("이름:" + "학생" + " 나이:" + 15 + " 성적:" + 80);
    }
}
