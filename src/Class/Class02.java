package Class;

public class Class02 {
    public static void main(String[] args) {
        Student student = new Student(); // 클래스 불러오기 선언 생성
        student.name = "학생1";
        student.age = 16;
        student.grade = 90;

        Student student1; // 클래스 선언
        student1 = new Student(); //클래스 생성
        student1.name = "학생2";
        student1.age = 13;
        student1.grade = 80;

        Student[] students = new Student[2];
        students[0] = student;
        students[1] = student1;

//        for (int i=0; i < students.length; i++){
//            System.out.println("이름:"+student[i].name);
//        }

        for (Student s : students){ //
            System.out.println("이름:"+s.name);
        }


//        System.out.println("이름: "+student1.name);   // 아래로 순서
//        System.out.println("이름: "+xoo1.name);
//        System.out.println("이름: "+xoo1."학생2");
    }
}
// 학생의 개념  나이 이름 성적을 적어줌  이 클래스로 만들어진 변수 student 는 인스턴스
// 클래스를 만들면 메모리가 생성이되고 변수 선언을 해서 참조값을 변수에 받아서 사용한다.
// student1.name = "학생"; <- student1은 1.xool로 접근 2. name 3. 대입 객체에 접근하려고 . 을 사용
// xool은 객체
// 객체는 클래스를 기반으로 생성된 실체 / 독립적으로 판단 가능해야함
// 실제 위치값을 가지고 있는 것은 기본형데이터
// calss , 배열은 참조형데이터 메모리주소의 메모리 주소를 가지고 있는
//