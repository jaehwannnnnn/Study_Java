package chapter11.section4;

public class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource(" + name + ") 열기]");
    }

    public String read1() {
        System.out.println("[MyResource(" + name + ") 열기]");
        return "100";
    }

    public String read2() {
        System.out.println("[MyResource(" + name + ") 열기]");
        return "abc";
    }

    public void close() throws Exception {
        System.out.println("[MyResource(" + name + ") 닫기]");
    }
}
