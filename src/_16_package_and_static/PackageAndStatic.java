package _16_package_and_static;

public class PackageAndStatic {
    public static void main(String[] args) {
        /**
         1. 패키지
            java 프로그램은 많은 클래스로 구성되고, 이러한 클래스를 폴더 형식으로 관리하는 것을 패키지라고 한다.

         패키지 이름 결정 요령
         - 패키지 이름은 패키지에 속해 있는 클래스가 최대한 다른 클래스와 중복되는 것을 방지할 수 있도록 만든다.
         - 패키지 이름은 일반적으로 도메인을 거꾸로 이용한다.
         - 개발 중에 패키지의 이름과 구조는 변경될 수 있다.
         - 패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성과 기능을 가지고 있는지 예상할 수 있도록 이름을 만든다.

         2. import
            다른 패키지에 있는 클래스를 사용하기 위해서는 import 키워드를 이용한다.

            예시)
            package com.java.employee;

            import com.java.dailyJournal.DailyJournal;
            import com.java.dailyJournal.ObjectClass;
            // import com.java.dailyJournal.*;      모든 클래스 사용

            public class Employee {
                DailyJournal journal = new DailyJournal( );
                ObjectClass objectClass = new ObjectClass( );
            }

            // com.java.dailyJournal.DailyJournal journal = new com.java.dailyJournal.DailyJournal( );      import를 원치 않는 경우, Class가 속한 패키지의 풀네임을 활용하면 되지만 이렇게 사용할 일은 거의 없다.

         3. static
            클래스의 속성과 메서드에 static 키워드를 사용하면 어디서나 속성과 메서드를 공유할 수 있다.

         */
    }
}
