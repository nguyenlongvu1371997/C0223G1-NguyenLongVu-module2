package ss17_serialization.exercise.product_management.repository;

import ss17_serialization.exercise.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements Serializable {
    String PATH = "C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\ss17_serialization\\exercise\\product_management\\repository\\product_repository";
    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream;
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;
    Scanner sc = new Scanner(System.in);
    List<Product> list = new ArrayList<>();

    public void addProduct(Product product) {

        try {
            if (readProduct() == null) {

                list.add(product);
            } else {
                list = readProduct();
                list.add(product);
            }
            fileOutputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readProduct() {
        try {
            File file = new File(PATH);
            if (file.length() == 0) {
                return null;
            } else {
                fileInputStream = new FileInputStream(PATH);
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<Product>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
