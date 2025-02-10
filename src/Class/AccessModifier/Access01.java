package Class.AccessModifier;

public class Access01 {

        public int publicField;
        int defaultField;
        private int privateField;

        public void publicMethod(){
            System.out.println("publicMethod : " + publicField);
        }

        void defaultMethod(){
        System.out.println("defaultMethod : " + defaultField);
        }

        private void privateMethod(){
            System.out.println("privateMethod : " + privateField);
        }

        public void innerAccess(){ // 여기서 실행
            System.out.println("내부호출");
            privateField = 10;
            publicField = 20;
            defaultField =30;
            publicMethod();
            privateMethod();
            defaultMethod();
        }
}
