package _13_method;

public class Method {
    public static void main(String[] args) {
        /**
         1. 메서드 선언과 호출
            메서드도 변수와 같이 선언 및 정의 후 필요 시에 호출하여 사용한다.

         * 메서드 선언 및 정의
        접근 지시 제어자(private, default, protected, public)      반환 타입(void, String, int, ...)       메서드 이름(매개 변수)
         public void getInfo( ) {       <-- 메서드 선언
            System.out.println(" i = " + i);        <-- 메서드 정의
            System.out.println(" b = " + b);
            System.out.println(" d = " + d);
            System.out.println(" c = " + c);
            System.out.println(" s = " + s);
         }

         * 메서드 호출
         ChildClass childClass = new ChildClass( );
         childClass.getInfo( );
         */

        /**
         2. 매개 변수(parameter)
            메서드를 호출할 때 데이터를 전달할 수 있다.

         public void getInfo( ) {       <-- 매개변수(parameter)는 필요 시에만 정의된다.
            ...
         }

         public void setInfo(int i, boolean b, double d, char c, String s) {        <-- 매개변수(parameter)는 자료형과 변수(지역변수)로 이루어진다.
            ...
         }
         */

        /**
         3. 중복 메서드(overloading)
            이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드를 만들 수 있다.

         public void getInfo( ) {
            System.out.println("-- getInfo - I --")
         }

         public void getInfo(int x, int y) {
            System.out.println("-- getInfo - II --");
            System.out.println("parameter --> x : %d, y : %d\n", x, y);
         }

         public void getInfo(String s1, String s2) {
            System.out.println("-- getInfo - III --");
            System.out.println("parameter --> s1 : %s, s2 : %s\n", s1, s2);
         }
         */

        /**
         4. 접근자
            메서드를 호출할 때 접근자에 따라서 호출이 불가할 수 있다.

         */
    }
}
