package _18_inheritance;

public class MainClass {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();   // ParentClass의 생성자가 먼저 생성되고, 그 후 ChildClass의 생성자가 생성된다.
        childClass.childFun();
        childClass.parentFun();

        //childClass.privateFun();  <-- 접근 불가
    }
}
