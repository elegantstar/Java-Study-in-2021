package _20_inner_class_and_anonymous_class;

import java.util.Arrays;

import _20_inner_class_and_anonymous_class.OuterClass.SInnerClass;

public class MainClass {
    public static void main(String[] args) {

        OuterClass oc = new OuterClass();
        System.out.println("oc.num : " + oc.num);
        System.out.println("oc.str1 : " + oc.str1);

        System.out.println();

        //멤버 inner 클래스
        OuterClass.InnerClass in = oc.new InnerClass();
        System.out.println("in.num : " + in.num);
        System.out.println("in.str2 : " + in.str2);

        System.out.println();

        // static inner 클래스
        OuterClass.SInnerClass si = new OuterClass.SInnerClass();
        System.out.println("si.num : " + si.num);
        System.out.println("si.str3 : " + si.str3);

        System.out.println();

        //익명(anonymous) 클래스
        new AnonymousClass() {

            @Override
            public void method() {
                System.out.println(" -- AnonymousClass's Override method START --");
            }

            ;
        }.method();

        // java 7 --> java 8
        TestInterface testInterface1 = new TestInterface() {
            @Override
            public void method() {
                System.out.println("method1");
            }
        };

        // 인터페이스에 메서드가 딱 1개인 경우에만 가능.
        TestInterface testInterface = () -> System.out.println("method1");

        TestInterface2 testInterface2 = (a, b) -> a + b;

        int test = testInterface2.sum(1, 2);
        int test2 = testInterface2.sum(5, 7);

        int[] ints = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }

        // java8
        // Stream -> lambda
        // 7칸 (1,2,3,4,5,6,7) -->
        // (6,,4,5,6,7)
        sum = Arrays.stream(ints).reduce(0, (a, b) -> a + b);

        // 절차지향 프로그래밍 (C언어)
        // 객체지향 프로그래밍 (상태 값이 있음)
        // 함수형 프로그래밍 (상태 값이 없음) Go,
    }
}
