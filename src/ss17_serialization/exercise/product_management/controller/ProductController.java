package ss17_serialization.exercise.product_management.controller;

import ss17_serialization.exercise.product_management.repository.ProductRepository;
import ss17_serialization.exercise.product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();

    public void displayMenu() {
        System.out.println("1. Thêm sản phẩm" + "\n" +
                "2. Hiển thị sản phẩm" + "\n" +
                "3. Tìm kiếm thông tin sản phẩm" + "\n" +
                "4. Thoát");
        boolean out = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("chọn thao tác: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
//                    thêm sản phẩm
                    productService.addProduct();
                    break;
                case 2:
//                    Hiển thị sản phẩm
                    productService.displayProduct();
                    break;
                case 3:
//                    tìm kiếm thông tin sản phẩm
                    productService.findProduct();
                    break;
                case 4:
                    out = true;
                    break;
                default:
                    System.out.println("nhập lộn rồi");
            }

        } while (out == false);
    }
}
