package Class;

public class Method02 {
    public static void main(String[] args) {
//        Student student2 = new Student();
//        initStudent(student2, "홍길동", 45,50);

        Student student1 = createStudent("락생", 42, 33);

        Student student2 = createStudent("홍길동", 45,50);
            // 변수 선언            // 값을 입력 return

            print(student1);
            print(student2);

        }

        static Student createStudent( String name, int age, int grade){
            Student student = new Student(); // 인스턴스 생성
            // 인스턴스 값 입력
            student.name = name;
            student.age = age;
            student.grade = grade;
            return student;
        }

        static void print(Student student){
            System.out.println("이름: " +student.name);
        }
    }
