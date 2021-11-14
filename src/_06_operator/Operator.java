package _06_operator;

public class Operator {
    public static void main(String[] args) {
        /**
         1. 피연산자 개수에 의한 구분
            피연산자 개수에 따라서 단항, 이항, 삼항 연산자로 구분
            단항 연산자      +x, -x, !x
            이항 연산자      x = y, x < y, x != y
            삼항 연산자      조건식 ? ture : false
         */

        /**
         2. 대입 연산자
            대입 연산자 '='는 오른쪽의 결과를 왼쪽에 대입(할당)한다.
            > 수학의 등호(equal, '=')는 JAVA에서 '=='로 표현하니 혼동 주의.
         */
        int x = 10;
        int y = 20;

        // 대입 연산자
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("---------------------");

        /**
        3. 산술 연산자
            피연산자를 이용하여 +., -, *, /, % 등을 수행한다.
            + 덧셈, - 뺄셈, * 곱셈, / 나눗셈, % 나머지
        */
        x = 10; y = 20;
        // 산술  연산자
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("---------------------");

        /**
         4. 복합 대입 연산자
            산술 연산자와 대입 연산자를 결합한 연산자
            += 더하고 대입, -= 빼고 대입, *= 곱하고 대입, /= 나누고 대입, %= 나머지를 대입
         */
        x = 10;
        System.out.println("x += 10 : " + (x += 10));
        x = 10;
        System.out.println("x -= 10 : " + (x -= 10));
        x = 10;
        System.out.println("x *= 10 : " + (x *= 10));
        x = 10;
        System.out.println("x /= 10 : " + (x /= 10));
        x = 10;
        System.out.println("x %= 10 : " + (x %= 10));

        System.out.println("---------------------");

        /**
         5. 관계 연산자
            두 개의 피연산자를 비교하여 참/거짓의 결론을 도출한다.
            >    a>b : a가 b 보다 크면 참
            <    a<b : a가 b 보다 작으면 참
            >=  a>=b : a가 b 보다 크거나 같으면 참
            <=  a<=b : a가 b 보다 작거나 같으면 참
            ==  a==b : a와 b가 같으면 참
            !=   a!=b : a와 b가 같지 않으면 참
         */
        x = 10; y = 20;
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));

        System.out.println("---------------------");

        /**
         6. 증감 연산자
            1 만큼 증가하거나 감소하는 연산을 수행한다.
            ++ 1만큼 증가
            -- 1만큼  감소
         */
        x = 10;
        System.out.println("++x : " + (++x));   // ++x 1 만큼 증가시킨 후 대입
        x = 10;
        System.out.println("--x : " + (--x));   // --x 1 만큼 감소시킨 후 대입
        x = 10;
        System.out.println("x++ : " + (x++));   // x++ 대입 후 1 만큼 증가
        System.out.println("x : " + x);
        x = 10;
        System.out.println("x-- : " + (x--));   // x-- 대입 후 1 만큼 감소
        System.out.println("x : " + x);

        System.out.println("---------------------");

        /*
         7. 논리 연산자
            피연산자의 논리곱(AND), 논리합(OR), 논리부정(NOT)을 수행한다.

            && 논리곱(AND)     a && b : a와 b가 모두 참이면 참
            || 논리합(OR)          a || b :  a와 b 중 하나라도 참이면 참
            ! 논리부정(NOT)     !a : a의 상태를  부정
         */
        boolean b1 = false;
        boolean b2 = true;
        System.out.println("b1 && b2 : " + (b1 && b2));
        System.out.println("b1 || b2 : " + (b1 || b2));
        System.out.println("!b1 : " + !b1);
        System.out.println("!b2 : " + !b2);

        System.out.println("---------------------");

        /**
         8. 조건(삼항) 연산자
            삼항 연산자로 두 개의 피연산자 연산 결과에 따라서 나머지 피연산자가 결정된다.

            조건식 ? 식1 : 식2       조건식이 참이면 식1이 실행되고, 조건식이 거짓이면 식2가 실행된다.
         */
        x = 10; y = 20;
        int result = 0;
        result = (x > y) ? 100 : 200;
        System.out.println("result : " + result);

        result = (x < y) ? 100 : 200;
        System.out.println("result : " + result);

        result = (x == y) ? 100 : 200;
        System.out.println("result : " + result);

        System.out.println("---------------------");

        /*
         9. 비트 연산자
            데이터를 비트(bit) 단위로 환산하여 연산을 수행하며, 다른 연산자 보다 연산 속도가 향상된다.

            & : AND 연산      a & b : a와 b가 모두 1이면 1
            | : OR 연산         a | b : a와 b 중 하나라도 1이면 1
            ^ : XOR 연산      a ^ b : a와 b가 같지 않으면 1

            x = 2       0 0 0 0 0 0 1 0
            y = 3       0 0 0 0 0 0 1 1

            x & y       0 0 0 0 0 0 1 0     (2)
            x | y         0 0 0 0 0 0 1 1     (3)
            x ^ y       0 0 0 0 0 0 0 1     (1)
         */
        x = 2;
        y = 3;
        System.out.println("x & y : " + (x & y));
        System.out.println("x | y : " + (x | y));
        System.out.println("x ^ y : " + (x ^ y));

    }
}
