package _27_input_and_output;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainClass004 {
    public static void main(String[] args) {

        String str = "Hello Java World!!";
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            outputStream = new FileOutputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\dataExam.txt");
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataOutputStream != null) dataOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (outputStream != null) outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
