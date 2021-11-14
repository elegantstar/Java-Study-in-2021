package _27_input_and_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import _19_inheritance_feature.ParentClass;

public class MainClass002 {
    public static void main(String[] args) {

        // write()
        OutputStream outputstream1 = null;
        try{
            outputstream1 = new FileOutputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\example.txt");
            String data1 = "Hello java world!!";
            byte[] arr = data1.getBytes();

            try {
                outputstream1.write(arr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputstream1 != null) outputstream1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // write()
        OutputStream outputStream2 = null;
        try {
            outputStream2 = new FileOutputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\example2.txt");
            String data2 = "HELLO JAVA WORLD!!";
            byte[] arr = data2.getBytes();

            try {
                outputStream2.write(arr, 0, 18);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream2 != null) outputStream2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
