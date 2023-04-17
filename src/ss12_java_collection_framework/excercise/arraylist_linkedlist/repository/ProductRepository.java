package ss12_java_collection_framework.excercise.arraylist_linkedlist.repository;

import ss12_java_collection_framework.excercise.arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> listProduct = new ArrayList<Product>();

    static {
        listProduct.add(new Product("001", "tủ lạnh", 300));
        listProduct.add(new Product("002", "điện thoại", 100));
        listProduct.add(new Product("003", "ti vi", 350));
        listProduct.add(new Product("004", "máy giặt", 200));
        listProduct.add(new Product("005", "máy tính", 325));
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public int findId(String id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void editProduct(int index, Product product) {
        listProduct.set(index, product);
    }

    public void deleteProduct(int index) {
                listProduct.remove(index);
    }

    public String findProduct(String name) {
        String string = "";
        for (Product p : listProduct) {
            if (p.getName().equals(name)) {
                string += p.toString() + "\n";
            }
        }
        return string;
    }

    public String findProduct(int i) {
        return listProduct.get(i).toString();
    }

    public String displayProduct() {
        String string = "";
        for (Product p : listProduct) {
            string += p.toString() + "\n";
        }
        return string;
    }

    public void sortProductIncrease(){
        listProduct.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
    }
    public void sortProductDecrease(){
        listProduct.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
    }

}
