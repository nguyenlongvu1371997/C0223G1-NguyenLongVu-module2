package ss12_java_collection_framework.excercise.arraylist_linkedlist.controller;

import ss12_java_collection_framework.excercise.arraylist_linkedlist.service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();

    public void displayMenu() {
        System.out.println("1.Thêm sản phẩm " + "\n" +
                "2.Sửa thông tin sản phẩm" + "\n" +
                "3.Xóa sản phẩm" + "\n" +
                "4.Hiện thị danh sách sản phẩm" + "\n" +
                "5.Tìm kiếm sản phẩm" + "\n" +
                "6.Sắp xếp sản phẩm theo giá" + "\n" +
                "7.Thoát");
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhập số bạn muốn thao tác: ");
            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.displayProduct();
                    break;
                case 5:
                    productService.findNameProduct();
                    break;
                case 6:
                    productService.sortProduct();
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("bạn nhập sai rồi");
                    break;
            }

        } while (flag);
        System.out.println("đã thoát");
    }
}
