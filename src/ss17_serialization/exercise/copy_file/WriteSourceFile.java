package ss17_serialization.exercise.copy_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteSourceFile {
    public void writeSourceFile(String string) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\ss17_serialization\\exercise\\copy_file\\source_file");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WriteSourceFile writeSourceFile = new WriteSourceFile();
        writeSourceFile.writeSourceFile("vũ đẹp trai");
    }
}
