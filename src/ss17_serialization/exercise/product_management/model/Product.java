package ss17_serialization.exercise.product_management.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 6433858223774886977L;
    private int code;
    private String name;
    private Double price;
    private String brand;
    private String describe;

    public Product() {
    }

    public Product(int code, String name, Double price, String brand, String describe) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.describe = describe;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
