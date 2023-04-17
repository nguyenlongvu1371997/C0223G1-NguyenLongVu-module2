package ss12_java_collection_framework.excercise.arraylist_linkedlist.repository;

import ss12_java_collection_framework.excercise.arraylist_linkedlist.model.Product;

public interface IProductRepository {
    public int findId(String id);

    public void addProduct(Product product);

    public void editProduct(int i, Product product);

    public void deleteProduct(int index);

    public String findProduct(String name);

}
