package Class.AccessModifier;

public class AccessMain {
    public static void main(String[] args) {
        Access01 data = new Access01();
        //public 호출 : 모든곳에서 가능 // 가능
        data.publicField = 1;
        data.publicMethod();

        //default 호출 : 같은 패키지에서 가능  // 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 : 클래스 내부에서만 가능  //불가능
//        data.privateField =3;
//        data.privateMethod();

        //내부실행  호출만 해주고 실행은 클래스 내부에서한다.
        data.innerAccess();

    }
}
