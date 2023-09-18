package chapter8;

public class Television2 implements RemoteControl2 {
    private int volume;

    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    public void setVolume(int volume) {
        if (volume > RemoteControl2.MAX_VOLUME) {
            this.volume = RemoteControl2.MAX_VOLUME;
        } else if (volume < RemoteControl2.MIN_VOLUME) {
            this.volume = RemoteControl2.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: "+this.volume);
    }
}
