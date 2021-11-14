package _12_class_and_object;

public class ClassAndObject {
    public static void main(String[] args) {
        /**
         1. 클래스 제작
            클래스는 멤버 변수(속성), 메서드(기능), 생성자 등으로 구성된다.

         package java_study012;

         public class Grandeur {    <-- 클래스 이름 : 일반적으로 첫 글자는 대문자로 한다.
            public String color;      <-- 멤버 변수(속성)
            public String gear;
            public int price;

            public Grandeur( ) {     <-- 생성자        * 외부에서 해당 클래스를 통해 객체를 생성할 때 생성자가 가장 먼저 호출됨. 생성자의 이름은 클래스 이름과 동일! 반환 타입이 없음!
                System.out.println("Grandeur constructor");
            }

            public void run( ) {      <-- 메서드(기능)       * 접근제어지시자(public, private 등) 반환 타입(void, string, int 등) 메서드 네임(소문자로 시작)
                System.out.println("-- run --");
            }

            public void stop( ) {    <-- 메서드(기능)
                System.out.println("-- stop --");
            }
         }
         */

        /**
         2. 객체 생성
            클래스로부터 'new'를 이용해서 객체를 생성한다.

         Grandeur myCar1 = new Grandeur( );
         myCar1.color = "red";
         myCar1.gear = "auto";
         myCar1.price = 30000000;

         myCar1.run( );
         myCar1.stop( );
         myCar1.info( );

         Grandeur myCar2 = new Grandeur( );
         myCar2.color = "blue";
         myCar2.gear = "manual";
         myCar2.price = 25000000;

         myCar2.run( );
         myCar2.stop( );
         myCar2.info( );

         --------------------------------------
         [메모리]
         myCar1 주소(레퍼런스) --> Grandeur 객체1
         myCar2 주소(레퍼런스) --> Grandeur 객체2
         ▶ 배열에서와 같은 원리. 배열도 객체이기 때문.
         */

        /**
         3. 생성자
            클래스에서 객체를 생성할 때 가장 먼저 호출된다.

         public class Bicycle {
            String color;
            int price;

            public Bicycle( ) {     <-- Default 생성자
                System.out.println("Bicycle constructor - I");
            }

            public Bicycle(String c, int p) {       <-- 생성자는 용도에 따라 여러 개를 만들어 둘 수 있다.
                System.out.println("Bicycle constructor - II"

                color = c;
                price = p;
            }

            public void info( ) {
                System.out.println("-- info( ) --");
                System.out.println("color : " + color);
                System.out.println("price : " + price);
            }
         }
         */

    }
}
