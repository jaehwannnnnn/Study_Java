package chapter8;

public class RemoteControl4Example {
    public static void main(String[] args) {
        RemoteControl3 rc;

        rc = new Television3();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
    }
}
