package _15_constructor_destructor_and_this;

public class ConstructorAndDestructorAndThis {
    public static void main(String[] args) {
        /**
         1. 디폴트 생성자(Default Constructor)
         객체가 생성될 때 가장 먼저 호출되는 생성자로, 만약 개발자가 명시하지 않았다고 하더라도 컴파일 시점에 자동 생성된다.

             `1) 디폴트 생성자가 있는 경우
             ObjectEx obj1 = new ObjectEx( );
                              ↓ 호출
             디폴트 생성자
             public ObjectEx( ) {
             System.out.println("Default constructor");
             }

             2) 디폴트 생성자가 없는 경우
             ObjectEx obj1 = new ObjectEx( );
                               ↓ 호출
             디폴트 생성자가 없는 경우 컴파일러가 자동으로 생성함
             public ObjectEx( ) {

             }`

         2. 사용자 정의 생성자(UserDefined Constructor)
         디폴트 생성자 외에 특정 목적에 의해서 개발자가 만든 생성자로, 매개변수에 차이가 있다.

             1) ObjectEx obj2 = new ObjectEx(10);
                                ↓ 호출
             사용자 정의 생성자
             public ObjectEx(int i) {
             System.out.println("UserDefined constructor");
             num = i;
             }

             2) int arr[ ] = {10, 20, 30};
             ObjectEx obj3 = new ObjectEx("Java", arr);
                                ↓ 호출
             사용자 정의 생성자
             public ObjectEx(String s, int i[]) {
             str = s;
             nums = i;
             }

         3. 소멸자(Destructor)
            객체가 GC에 의해서 메모리에서 제거 될 때 finalize() 메서드가 호출된다.

         ObjectEx obj4;
         obj4 = new ObjectEx();
         obj4 = new ObjectEx();

         System.gc();

            * System.gc(); 를 사용한다고 해서 GC가 바로 작동하는 것이 아니라, 가급적 빨리 작동하도록 요청하는 것이다.
            * java는 기본적으로 메모리를 개발자가 직접 관리하지 않으므로 일반적으로 System.gc();를 사용하는 경우는 드물다.

         System.gc();       // 객체가 소멸될 때 finalize 메서드가 호출됨. 사용할 일은 거의 없을 것.
         ----> @Override
                 protected void finalize() throws Throwable {
                    System.out.println("-- finalize() method --");
                    super.finalize();
                 }

         4. this 키워드
            현재 객체를 가리킬 때 this를 사용한다.

         int ints[] = {10, 20, 30};
         ObjectEx obj5 = new ObjectEx(10, "Java", ints);
         */
    }
}

