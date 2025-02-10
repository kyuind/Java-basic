package Class1;

public class MusicPlayer {
    //멤버변수
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");
    }
        void off(){
            isOn = false;
            System.out.println("음악 플레이어를 종료합니다.");
    }
    void setVolume(int vol){
        volume += vol;
        System.out.println("음악 플레이어 볼륨:"+vol);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악플레이어 상태: ON");
            System.out.println("음악플레이어 볼륨 : "+volume);
        }else{
            System.out.println("음악플레이어 off");
        }
    }
}
