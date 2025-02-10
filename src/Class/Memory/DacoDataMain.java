package Class.Memory;

public class DacoDataMain {
    public static void main(String[] args) {
        String s = "Hello java";
        String deco = DacoData.deco(s);

        System.out.println("before:" +s);
        System.out.println("after :"+deco);
        System.out.println();
    }
}
