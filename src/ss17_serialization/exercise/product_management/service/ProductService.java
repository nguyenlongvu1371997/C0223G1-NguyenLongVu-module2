package ss17_serialization.exercise.product_management.service;

import ss17_serialization.exercise.product_management.model.Product;
import ss17_serialization.exercise.product_management.repository.ProductRepository;

import java.util.Scanner;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.print("nhập code: ");
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
        productRepository.addProduct(product);
    }

    public void displayProduct() {
        if (productRepository.readProduct() == null) {
            System.out.println("không có sản phẩm nào");
        } else {
            System.out.println(productRepository.readProduct());
        }
    }

    public void findProduct() {
        if (productRepository.readProduct() == null) {
            System.out.println("không có sản phẩm để tìm");
            return;
        }
        System.out.println("nhập mã sản phẩm cần tìm");
        int code = Integer.parseInt(sc.nextLine());
        for (Product product : productRepository.readProduct()) {
            if (product.getCode() == code) {
                System.out.println(product);
                return;
            }
            System.out.println("không tìm thấy sản phẩm");
        }
    }
}
