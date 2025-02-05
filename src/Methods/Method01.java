package Methods;

public class Method01 {
    public static void main(String[] args) {
        // 1. method 호출
        // 2. parameter 변수 a=5, b=10 전달 후 method 실행
        // 3. 실행 후 연산 수행
        // 4. 반환된 값이 sum1 변수에 저장
        int result1 = add(5,10);
        //method 호출 : add(5,10)
        // int result1 = 15
        System.out.println(result1);

        int result2= add(20,5);
        System.out.println(result2);
    }
    // Method
    //public : 다른 클래스에서 호출할 수 있는 method
    //static : 객체를 생성하지 않고 호출할 수 있는 (정적)method
    //int(type) : 반환 타입
    //add(int a, int b) : 시그니처 signature
    // add : MethodName
    // (int a, int b) : 매개변수(parameter) method를 호출할때 필요한 값

    public static int add(int a, int b){ //Method 선언
        System.out.println(a+" + "+b+" = "+ (a+b)); //Method 본문
        int sum = a + b;
        // return : method의 반환 결과
        return sum;
    }
}
