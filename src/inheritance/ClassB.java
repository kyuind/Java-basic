package inheritance;

public class ClassB extends ClassA{
    public ClassB(int a){
//        super(); // 부모 생성자가 없는경우(파라미터가 없는경우) 생략 가능
        System.out.println("ClassB.ClassB"+a);
    }

    public ClassB(int a ,int b){
        super();// 부모의 생성자
        System.out.println("ClassB.ClassB :"+a+b);
    }
}
