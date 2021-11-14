package _04_data_type;

public class Primitive_Data_Type {
    public static void main(String[] args) {
        /**
        Java Primitive Data Type(기본 자료형)
        1. 정수형
            byte     -  1byte
            char     -  2byte
            short    -  2byte
            int       -  4byte
            long     -  8byte
        2. 실수형
            float     -  4byte
            double  -  8byte
        3. 논리형
            boolean -  1byte
         */

        char c = 'a';
        System.out.println("c = " + c);

        int i = 10;
        System.out.println("i = " + i);

        double d = 10.258;
        System.out.println("d = " + d);

        boolean b = false;
        System.out.println("b = " + b);

        String s = "Hello Java World!!";
        System.out.println("s = " + s);

        System.out.println("-----------------------");

        /**
        1. 자동 형변환(promotion, 묵시적 형변환)
            크기가 작은 데이터 타입에서 큰 데이터 타입으로 변환
            = 작은 공간의 메모리에서 큰 공간의 메모리로 이동
         */
        byte by = 10;
        int in = by;
        System.out.println("in = " + in);

        /**
         2. 강제 형변환(type casting, 명시적 형변환)
            크기가 큰 데이터 타입을 작은 데이터 타입으로 변환
            = 큰 공간의 메모리에서 작은 공간의 메모리로 이동
         */
        int iVar = 100;
        byte bVar = (byte)iVar;
        System.out.println("bVar = " + bVar);

        iVar = 123456;
        bVar = (byte)iVar;
        System.out.println("bVar = " + bVar);

        //강제 형변환은 데이터의 누실이 발생할 수 있음.

    }
}
