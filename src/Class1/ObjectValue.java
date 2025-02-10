package Class1;
// 같은 스코프에 있기 때문에  value를 가져다가 사용할 수 있다.
public class ObjectValue {
    int value;
    // 클래스를 만드는 방법
    // 매서드
    void add(int plus){
        value+=plus;
        System.out.println("숫자증가("+plus+")value"+value);
    }
}
