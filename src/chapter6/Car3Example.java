package chapter6;

public class Car3Example {
    public static void main(String[] args) {
        Car3 myCar=new Car3();
        myCar.setSpeed(-50);
        System.out.println("현재 속도: "+myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도: "+myCar.getSpeed());

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}
