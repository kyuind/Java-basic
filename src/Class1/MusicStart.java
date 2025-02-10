package Class1;

public class MusicStart {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.setVolume(3); // 볼륨3
        player.setVolume(-2); // 볼륨-2
        player.showStatus(); // 상태 확인 //상태 // 1
        player.off(); // 종료
    } //
}
