package Polymorphism;

public class AnimalSoundMain2 {
    public static void main(String[] args){
//        Dog dog=new Dog();
//        Cat cat=new Cat();
//        Cow cow=new Cow();
//        Animal[] animals ={dog,cat,cow};
        Animal[] animals = {new Dog(),new Cat(),new Cow()};

        for (Animal ani: animals){
            System.out.println("동물 소리 테스트 시작");
            ani.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
