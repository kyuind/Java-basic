package Class.AccessModifier;

public class Accessmodifier {
    private int volume; // 해당클래스 내부에서만 접근 가능 /내부에 숨겨진 속성 사용자가 건들지 못하게 하려고.
    // 사용자가 마음대로 변경을 하지 못하게 하려고

    Accessmodifier(int volume){
        this.volume = volume;
    }
    void setVolume(){
        if (volume >= 100){
            System.out.println("음량을 더이상 증가 할 수 없습니다.");
        } else{
            volume += 10;
            System.out.println("볼륨을 10 증가했습니다.");
        }
    }
    void showVolume(){
        System.out.println("현재 음량 : "+ volume);
    }
} //private → default(package-private) → protected → public
  // 클래스       패키지                 패키지+상속관계  모든곳