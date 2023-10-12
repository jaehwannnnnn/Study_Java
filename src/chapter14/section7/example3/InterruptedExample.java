package chapter14.section7.example3;

public class InterruptedExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        thread.interrupt();

    }
}
