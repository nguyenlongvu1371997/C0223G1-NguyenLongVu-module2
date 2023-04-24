package ss17_serialization.exercise.product_management.service;

import ss17_serialization.exercise.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements Serializable {
    String PATH = "C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\ss17_serialization\\exercise\\product_management\\repository\\product_repository";
    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream;
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;
    Scanner sc = new Scanner(System.in);
    List<Product> list = new ArrayList<>();

    public void addProduct() {
        System.out.print("nhập mã: ");
        int code = Integer.parseInt(sc.nextLine());
        System.out.print("nhập tên: ");
        String name = sc.nextLine();
        System.out.print("nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("nhập hãng: ");
        String brand = sc.nextLine();
        System.out.print("nhập mô tả: ");
        String describe = sc.nextLine();
        Product product = new Product(code, name, price, brand, describe);
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

    public void displayProduct() {
        if (readProduct() == null) {
            System.out.println("không có sản phẩm nào");
        } else {
            System.out.println(readProduct());
        }
    }

    public void findProduct() {
        System.out.println("nhập mã sản phẩm cần tìm");
        int code = Integer.parseInt(sc.nextLine());
        if (readProduct() == null) {
            System.out.println("không có sản phẩm để tìm");
            return;
        }
        for (Product product : readProduct()) {
            if (product.getCode() == code) {
                System.out.println(product);
                return;
            }
            System.out.println("không tìm thấy sản phẩm");
        }
    }
}
