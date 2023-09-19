package chapter8;

public class Audio3 implements RemoteControl3 {
    private int volume;

    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    public void setVolume(int volume) {
        if (volume > RemoteControl3.MAX_VOLUME) {
            this.volume = RemoteControl3.MAX_VOLUME;
        } else if (volume < RemoteControl3.MIN_VOLUME) {
            this.volume = RemoteControl3.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + volume);
    }
    private int memoryVolume;
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl3.MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
