package variables;

public class VariableNaming {
    public static void main(String[] args){
        int studentCount = 30;
        double maxScore = 99.5;
        final int USER_LIMIT = 100; // final 키워드는 상수라는 뜻

        System.out.println("학생수: " + studentCount);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("사용자 제한: " + USER_LIMIT);
    }
}
