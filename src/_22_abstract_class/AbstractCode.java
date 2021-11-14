package _22_abstract_class;

public class AbstractCode {
    public static void main(String[] args) {
        StaticTestClass staticTestClass = new StaticTestClass();

    }
}


class StaticTestClass {
    private String name;
    private int age;
    private static String commonName;       //주소 값 : 0x1000 --> "common!"

    public void print() {
        System.out.println("hi");
    }

    public static void print2() {                //주소 값 : 0x1001
        System.out.println("hi2");
    }
}