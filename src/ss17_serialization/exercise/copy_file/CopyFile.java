package ss17_serialization.exercise.copy_file;

import java.io.*;

public class CopyFile {
    public void copyFile() {
        String PATH_SOURCE = "C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\ss17_serialization\\exercise\\copy_file\\source_file";
        String PATH_TARGET = "C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\ss17_serialization\\exercise\\copy_file\\target_file";
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            File file1 = new File(PATH_SOURCE);
            File file2 = new File(PATH_TARGET);
            if (file1.length() == 0) {
                System.out.println("file nguồn rỗng");
                return;
            }
            if (file2.length() != 0) {
                System.out.println("file đích không rỗng");
                return;
            }
            System.out.println(file1.length());
            fileInputStream = new FileInputStream(PATH_SOURCE);
            objectInputStream = new ObjectInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream(PATH_TARGET);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objectInputStream.readObject());
            objectInputStream.close();
            fileInputStream.close();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.copyFile();
    }

}
