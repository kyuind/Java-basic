package Class;

public class Null3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count : "+bigData.count); // int 0 으로 초기화
        System.out.println("bigData.data : "+bigData.data); // 참조형 null 으로 초기화

        bigData.data = new Data(); // 0다시 초기화를 시켜주면된다. 참조값을 다시 받아와서 사용하낟.
        System.out.println("bigdata.data.value : "+bigData.data.value); //예외

        //객체가 null이 되면, 그 객체를 참조하는 변수가 없어지므로 GC의 대상이 됨.
    }
}
//package ref;
//public class NullMain {
//    public static void main(String[] args) {
//        Student student = null; // 아직 객체를 생성하지 않음
//        // student.name = "학생1";  // NullPointerException 발생 (주석 해제 시)
//
//        student = new Student(); // 객체 생성
//        student.name = "학생1";  // 정상 작동
//        System.out.println("이름: " + student.name);
//    }
//}

//절차지향은 프로세스가 중심이디ㅏ. 프로세스 = 순서 (절차지향 처럼 코딩을 하고있다.)
//데이터 메서드 따로관리  ..어떻게?..

// 객체지향은 객체(대상)을 중심으로 프로그래밍 데이터 메서드 같이관리 ...무엇?...
// 개념3가지 추상화.캡슐화.다형성  객체지향 언어 대표 자바
// class 객체로 묶어서 관리하면 해결