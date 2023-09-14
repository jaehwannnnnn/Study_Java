package chapter6;

public class CarGasExample {
    public static void main(String[] args) {
        CarGas myCar=new CarGas();
        myCar.setGas(5);
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
