package ss12_java_collection_framework.excercise.arraylist_linkedlist.service;

import ss12_java_collection_framework.excercise.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.excercise.arraylist_linkedlist.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.print("nhập id: ");
        String id = sc.nextLine();
        System.out.print("nhập tên: ");
        String name = sc.nextLine();
        System.out.print("nhập giá: ");
        int price = Integer.parseInt(sc.nextLine());
        productRepository.addProduct(new Product(id, name, price));
    }

    public void deleteProduct() {
        System.out.print("nhập id hàng hóa bạn muốn xóa: ");
        String id = sc.nextLine();
        int index = productRepository.findId(id);
        if (index == -1) {
            System.out.println("không tìm thấy id");
        } else {
            productRepository.deleteProduct(index);
            System.out.println("xóa thành công");
        }

    }

    public void editProduct() {
        System.out.println("nhập id hàng hóa bạn muốn sửa");
        String id = sc.nextLine();
        int index = productRepository.findId(id);
        if (index == -1) {
            System.out.println("không tìm thấy id");
        } else {
            System.out.println(productRepository.findProduct(index));
            System.out.print("nhập id: ");
            String newId = sc.nextLine();
            System.out.print("nhập tên: ");
            String newName = sc.nextLine();
            System.out.print("nhập giá: ");
            int newPrice = Integer.parseInt(sc.nextLine());
            productRepository.editProduct(index, new Product(newId, newName, newPrice));
        }
    }

    public void findNameProduct() {
        System.out.print("nhập tên: ");
        String name = sc.nextLine();
        System.out.println(productRepository.findProduct(name));
    }

    public void displayProduct() {
        System.out.println(productRepository.displayProduct());
    }

    public void sortProduct() {
        System.out.println("bấm \"1\" để sắp xếp từ nhỏ đến lớn");
        System.out.println("bấm \"2\" để sắp xếp từ lớn đến nhỏ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            productRepository.sortProductIncrease();
        } else if (choice == 2) {
            productRepository.sortProductDecrease();
        }
        System.out.println(productRepository.displayProduct());
    }
}
