package Array;

public class Array08 {
    public static void main(String[] args) {
        // 2차원 배열 만들기(2*3)
//        int[][] arr = new int[2][3];
//
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
        // 2차원 배열 초기화
//        int [][] arr = {
//                {1,2,3},
//                {4,5,6}
//        };
        // 반복문 활용한 1씩 증가하는 값 입력
        int [][] arr = new int[2][3];
        // 2차원 배열에 입력할 값 선언
        int i =1;
        for( int row= 0; row<arr.length; row++){
            for(int col =0; col < arr[row].length; col++){
                arr[row][col] = i++;
            }
        }

        // 행 반복 출력
        //arr.length는 행의 개수
        //arr[row].length는 열의 개수
       for (int row=0; row < arr.length; row++){
           for(int col = 0; col< arr[row].length; col++){
               System.out.print(arr[row][col]+" ");
           }
           System.out.println();
       }

    }
}
