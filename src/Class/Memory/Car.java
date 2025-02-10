package Class.Memory;

public class Car {
    // 판매된 차량의 모든 차량의 수
    private static int totalsales;
    private String name; //차량이름

    // 생성자 차량이 판매되면
    public Car(String name){
        System.out.println("차량구입 // 차량명칭 : " + name);
        this.name = name;
        totalsales++;
    }
    
    public static void showTotalSales(){
        System.out.println("판매된 차량 수 : "+totalsales);
    } 
}
