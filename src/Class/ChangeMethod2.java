package Class;

public class ChangeMethod2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("매서드 호출전 : "+dataA.value);
        changeRef(dataA);
        System.out.println("매서드 호출 후 : "+dataA.value);
    }
    static void changeRef(Data dataX){
        dataX.value = 20;
    }
}
