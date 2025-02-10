package Class;

public class Method01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "락생", 42, 33);

        Student student2 = new Student();
        initStudent(student2, "홍길동", 45,50);

        print(student1);
        print(student2);

    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void print(Student student){
        System.out.print("이름" +student.name);
    }
}
