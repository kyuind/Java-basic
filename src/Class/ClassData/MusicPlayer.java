package Class.ClassData;

public class MusicPlayer {
    int volume=0;
    boolean isOn=false;
    boolean on;

    void setVolume(int vol) {
        volume += vol;

        System.out.println("음악 플레이어 볼륨: " + vol);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("음악플레이어 상태 : ON");
            System.out.println("음악플레이어 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}