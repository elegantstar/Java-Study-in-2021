package _15_constructor_destructor_and_this;

public class ObjectClass {

    public int x;   // 전역 변수 : 객체가 생성되고 소멸될 때까지 항상 메모리에 있는 데이터 변수
    public int y;

    public ObjectClass( ) {
        System.out.println("-- ObjectClass( ) --");
    }

    public ObjectClass(String s, int[] iArr) {
        System.out.println("-- ObjectClass( ) --");

        System.out.println("s ----> " + s);
        System.out.println("iArr ----> " + iArr);
    }

    public ObjectClass(int x, int y) {  // 여기 있는 x, y는 호출부에서 전달 받은 값을 담는 매개 변수
        this.x = x;         // this는 ObjectClass로부터 만들어지는 객체, 즉 자기자신의 객체를 의미하며, this.x는 그 객체에 속해있는 전역 변수 x를 의미함.
        this.y = y;
    }

    public void getInfo() {
        System.out.println("x ----> " + x);
        System.out.println("y ----> " + y);
    }
}
