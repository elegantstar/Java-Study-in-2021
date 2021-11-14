package _05;

public class Ch05 {
    public static void main(String[] args) {
        /*
        1. 특수 문자
             일반 문자가 아닌 특수한 목적으로 사용되는 문자
         \t : 탭
         \n : 줄바꿈
         \' : 작은 따옴표
         \" : 큰 따옴표
         \\ : 역 슬래시(back slash)
         */

        System.out.println("Good \tMorning~");     // \t
        System.out.println("Good\nMorning~");     // \n
        System.out.println("Good\'Morning~\'");     // \'
        System.out.println("Good\"Morning~\"");     // \"
        System.out.println("Good\\Morning~\\");     // \\

        System.out.println("--------------------------------");

        /*
        2. 서식 문자
            일반 문자가 아닌 서식에 사용되는 문자

        printf() 매서드 이용
         : f는 format(형식)을 뜻함.

         %d - 10진수
         %o - 8진수
         %x - 16진수
         %c - 문자
         %s - 문자열
         %f - 실수
         */

        // 서식 문자
        System.out.println("오늘의 기온은 10도입니다.");
        System.out.printf("오늘의 기온은 %d도입니다.\n", 10);

        int num1 = 20;
        System.out.println("오늘의 기온은 " + num1 + "도입니다.");
        System.out.printf("오늘의 기온은 %d도입니다.\n", num1);

        System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n", 6, 2, 10);

        System.out.println();

        // 정수
        int num2 = 30;
        System.out.printf("num2(10진수) : %d\n", num2);
        System.out.printf("num2(8진수) : %o\n", num2);
        System.out.printf("num2(16진수) : %x\n", num2);

        System.out.println();

        // 문자
        System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'A');

        System.out.println();

        // 문자열
        System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\''입니다.\n", "java", "JAVA");

        System.out.println();

        // 실수
        float f = 1.23f;
        System.out.printf("f = %f\n", f);

        double d = 1.23456d;
        System.out.printf("d = %f\n", d);

        System.out.println("--------------------------");

        // 3. 서식 문자의 정렬과 소수점 제한 기능
        // 서식 문자 정렬 기능
        System.out.printf("%d\n", 123);
        System.out.printf("%d\n", 1234);
        System.out.printf("%d\n", 12345);

        System.out.println();

        System.out.printf("%5d\n", 123);        // d 앞의 숫자 크기 만큼의 자리수를 갖도록
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        System.out.println();

        // 서식 문자 소수점 제한 기능
        System.out.printf("%f\n", 1.23);
        System.out.printf("%.0f\n", 1.23);
        System.out.printf("%.1f\n", 1.23);
        System.out.printf("%.2f\n", 1.23);
        System.out.printf("%.3f\n", 1.23);

    }
}
