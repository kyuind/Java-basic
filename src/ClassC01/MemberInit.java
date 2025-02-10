package ClassC01;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit(String name,  int grade){ // 매개변수가 name name면 우선순위를 가져서 나는 나다
        this(name,33,grade); // 자기 자신 생성자를 호출한다. 가로를 치면 인스턴스를 생성한것같이
    }
    //생성자 오버로딩 같은 이름의 생성자를 여러 개 정의할 수 있음. 매개변수의 개수, 타입이 다르면 허용됨.

    MemberInit(String name, int age, int grad){ // 매개변수가 name name면 우선순위를 가져서 나는 나다
        this.name = name; // this를 사용해서 this라는 접근자를 사용해서 자기자신의 인스턴스를 가르킨다. //this.member2가된다.
        this.age = age;
        this.grade = grad; // 생성자
    }
}
