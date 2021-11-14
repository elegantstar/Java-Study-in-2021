package _15_constructor_destructor_and_this;

public class MainClass {
    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();

        System.out.println();

        int[] iArr = {10, 20, 30};
        ObjectClass obj2 = new ObjectClass("Hello", iArr);

        System.out.println( );

        ObjectClass obj3 = new ObjectClass(10, 20);

        obj3.getInfo();

    }
}
