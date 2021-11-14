package _08_array_and_memory;

import java.sql.SQLOutput;
import java.util.Arrays;

import _07_array.Array;

public class ArrayAndMemory {
    public static void main(String[] args) {
        /**
         1. 배열의 메모리 크기
            배열을 구성하는 데이터의 자료형에 따라서 메모리 크기가 결정된다.
         */

        /*
        int[] arr = new int[3];
        1byte 1byte 1byte 1byte     1byte1byte 1byte 1byte     1byte1byte 1byte 1byte
        └──int형 : 4byte──┘   └──int형 : 4byte──┘  └──int형 : 4byte──┘
        └──────────────  arr : 12byte  ──────────────┘
         */

        /**
         2. 배열을 가리키는 배열 이름
            기본 자료형 데이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터의 주소를 담고 있다.
         */

        /*
        int i = 10;  --> 변수 i의 메모리에는 10이 저장

        int[] i = new int[3];  --> 배열 i의 메모리에는 i[]의 주소가 저장 // i[0] = 10, i[1] = 20, i[2] = 30 는 다른 곳에 저장되어 있음.
         */

        // 3. 배열 기본 속성
        int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
        int[] arrAtt2 = null;
        int[] arrAtt3 = null;

        //배열 길이
        System.out.println("arrAtt1.length : " + arrAtt1.length);

        //배열 요소 출력
        System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));

        //배열 요소 복사
        arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
        System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
        /** 배열을 복사하여 arrAtt1과 arrAtt3이 같은 값을 가리키고 있지만, 배열 요소들의 주소까지 같은 것은 아니다.
         arrArr1[i]와 같은 값을 복사하여, 다른 곳에 저장한 후 arrArr3는 그 새롭게 저장된 arrAtt3[i]의 주소를 참조하는 것.
        값은 같지만 참조하는 메모리 주소는 다르기 때문에 다른 객체임.
        */

        // 배열 레퍼런스
        arrAtt2 = arrAtt1;
        System.out.println("arrAtt1 : " + arrAtt1);
        System.out.println("arrAtt2 : " + arrAtt2);
        System.out.println("arrAtt3 : " + arrAtt3);
        /**
         arrAtt2에 arrAtt1를 대입하는 것이므로, 이 경우에는 arrAtt1과 arrAtt2는 같은 곳을 가리키고 있는 것.
        */
        System.out.println("-------------------------");

        /**
         4. 다차원 배열
         배열 안에 또 다른 배열이 존재. 2차원 배열은 종종 쓰이긴 하지만, 3차원 배열은 사용할 일이 거의 없다.
         3차원 배열의 경우 메모리 사용량이 과도하게 커지며, 로직이 굉장히 복잡해지기 때문이다.
         */

        int[][] arrMul = new int[3][2];
        arrMul[0][0] = 10;
        arrMul[0][1] = 100;
        arrMul[1][0] = 20;
        arrMul[1][1] = 200;
        arrMul[2][0] = 30;
        arrMul[2][1] = 300;

        System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
        System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
        System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));

    }
}
