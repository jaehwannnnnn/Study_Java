package chapter7;

public class Child2Example {
    public static void main(String[] args) {
        Parent2 parent = new Child2();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*
        parent.field2="data2"; 불가능
        parent.method3();  불가능
         */
        Child2 child = (Child2) parent;
        child.field2 = "data2";
        child.method3();
    }
}
