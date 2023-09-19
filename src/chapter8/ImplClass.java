package chapter8;

public class ImplClass implements InterfaceF{
    public void methodD() {
        System.out.println("methodD() 실행");
    }

    public void methodE() {
        System.out.println("methodE() 실행");
    }

    @Override
    public void methodF() {
        System.out.println("methodF() 실행");
    }
}
