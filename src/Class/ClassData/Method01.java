package Class.ClassData;

public class Method01 {
    public static void main(String[] args) {

        Student student1 = createStudent("신누리", 25, 100);
        Student student2 = createStudent("홍길동",45,50);

        printSt(student1);
        printSt(student2);

    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student(); //인스턴스 생성
        //인스턴스 값 입력
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;


    }
    static void printSt(Student student){
        System.out.println("이름: " + student.name);
    }
}
