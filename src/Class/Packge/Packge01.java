package Class.Packge;


import Class.Packge2.Test;

public class Packge01 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value =72;
        System.out.println(data.value);

        Test test  =new Test();
        test.name ="test";
        System.out.println(test.name);
    } //캡슐화
}
