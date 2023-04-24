package ss17_serialization.exercise.product_management.view;

import ss17_serialization.exercise.product_management.controller.ProductController;

public class ViewProduct {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayMenu();
    }
}
