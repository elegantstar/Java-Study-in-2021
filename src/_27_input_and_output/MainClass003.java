package _27_input_and_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass003 {
    public static void main(String[] args) {

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\hello.txt");
            outputStream = new FileOutputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\helloCopy.txt");

            byte[] arr = new byte[3];

            while (true) {
                int len = inputStream.read(arr);
                if (len == -1) break;
                outputStream.write(arr, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
