package scope;

public class Scope02 {
    public static void main(String[] args) {
        int m =10 ;
        int temp = 0;

        if (m>0){
            temp = m*2;
            System.out.println(temp);
        }
        System.out.println(m);
    }
}
// 좋지않은 코드
