package Array;

public class Array9 {
    public static void main(String[] args) {
        // 2차원 배열 만들기 (2*3)
//        int[][] arr = new int[2][3];

//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
        // 2차원 배열 초기화
//        int [][] arr ={
//                {1,2,3},
//                {4,5,6}
//        };
        // 반복문을 활용한 1씩 증가하는 값 입력
        // 2차원 배열 생성
        int[][]arr = {
                {1,3,5},
                {2,4,6}
        };

        // 2차원 배열에 입력할 값 선언
//            int i = 1;
//            for(int row=0; row<arr.length; row++){
//                for(int col=0; col<arr[row].length; col++){
//                    arr[row][col]=i++;
//                }
//            }



//        //행 반복 출력
//        for (int row=0; row<2; row++){
//            System.out.print(arr[row][0] + " ");
//            System.out.print(arr[row][1] + " ");
//            System.out.print(arr[row][2] + " ");
//            System.out.println();

            //행과 열 반복 출력
            for (int row=0; row<arr.length; row++){
                for (int col=0; col<arr[row].length; col++){
                    System.out.print(arr[row][col]);
                }
                System.out.println();
            }
    }

}
