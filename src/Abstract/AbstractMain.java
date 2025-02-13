package Abstract;

public  class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Bird bird = new Bird();

        bird.fly();
        bird.move();
        bird.sound();


        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(caw);

    }

    public static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();  // 각 동물의 오버라이딩된 move() 실행
        System.out.println("동물 이동 테스트 종료");
    }
}
