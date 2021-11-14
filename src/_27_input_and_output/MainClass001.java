package _27_input_and_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import _19_inheritance_feature.ParentClass;

public class MainClass001 {
    public static void main(String[] args) {

        // read()
        InputStream inputStream1 = null;
        try {
            inputStream1 = new FileInputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\hello.txt");
            int data1 = 0;

            while (true) {
                try {
                    data1 = inputStream1.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(data1 == -1) break;
                System.out.println("data : " + data1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream1 != null) inputStream1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("=======================");

        // read(byte[])
        InputStream inputStream2 = null;
        try {
            inputStream2 = new FileInputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\hello.txt");
            int data = 0;
            byte[] bs = new byte[3];

            while (true) {
                try {
                    data = inputStream2.read(bs);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(data == -1) break;
                System.out.println("data : " + data);
                for (int i = 0; i < bs.length; i++) {
                    System.out.println("bs[" + i + "] : " + bs[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
