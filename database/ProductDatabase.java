package database;

import element.Product;

import java.util.ArrayList;

public class ProductDatabase {

    private static final ArrayList<Product> products = new ArrayList<>();

    private ProductDatabase() {

    }

    public static void createDefaultProducts() {
        products.clear();

        Product iPhoneX = Product.create("I-Phone X",
                "Black",
                "Phone",
                10,
                0.168,
                "Mobile Phone");

        Product iPhoneSE = Product.create("I-Phone SE",
                "White",
                "Phone",
                5,
                0.148,
                "Mobile Phone ");

        Product iPhone11 = Product.create("I-Phone 11",
                "Yellow",
                "Phone",
                1,
                0.194,
                "Mobile Phone ");

        products.add(iPhoneX);
        products.add(iPhoneSE);
        products.add(iPhone11);
    }

    public static void add(Product product) {
        products.add(product);
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }
}
