package _27_input_and_output;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass005 {
    public static void main(String[] args) {

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            inputStream = new FileInputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\dataExam.txt");
            dataInputStream = new DataInputStream(inputStream);

            String str = dataInputStream.readUTF();

            outputStream = new FileOutputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\dataExamCopy.txt");
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
