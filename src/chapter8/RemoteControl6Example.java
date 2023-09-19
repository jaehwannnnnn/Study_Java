package chapter8;

public class RemoteControl6Example {
    public static void main(String[] args) {
        RemoteControl4 rc;

        rc = new Television4();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        rc = new Audio4();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();
        RemoteControl4.changeBattery();
  }
}
