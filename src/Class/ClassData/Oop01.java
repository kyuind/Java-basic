package Class.ClassData;

public class Oop01 {
    public static void main(String[] args) {
        Data data = new Data();

        add(data);
        add(data);
        add(data);
        add(data);
        System.out.println("최종 숫자 = "+ data.value);
    }
    static void add(Data data){
        data.value++;
        System.out.println("숫자 증가 : value = "+data.value);
    }
}
