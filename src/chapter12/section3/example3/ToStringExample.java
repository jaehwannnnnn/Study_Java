package chapter12.section3.example3;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
        String strObj = myPhone.toString();
        System.out.println(strObj);
        System.out.println(myPhone);
    }
}
