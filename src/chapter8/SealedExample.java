package chapter8;

public class SealedExample {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();
        InterfaceD id = impl;
        id.methodD();
        System.out.println();

        InterfaceE ie = impl;
        ie.methodD();
        ie.methodE();
        System.out.println();

        InterfaceF ig = impl;
        ig.methodD();
        ig.methodE();
        ig.methodF();
    }
}
