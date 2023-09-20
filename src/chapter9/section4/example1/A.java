package chapter9.section4.example1;

public class A {
    A() {
        class B { }

        B b = new B();
    }

    void method() {
        class B{}

        B b = new B();
    }
}
