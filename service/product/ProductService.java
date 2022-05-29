package service.product;

import database.ProductDatabase;
import database.UserDatabase;
import element.Product;
import element.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {

    public void printFavoriteProducts() {
        ArrayList<Product> favoriteProducts = UserDatabase.getUser().getFavoriteProducts();
        printProducts(favoriteProducts);
    }

    public void printAllProducts() {
        ArrayList<Product> products = ProductDatabase.getProducts();
        printProducts(products);
    }

    public void favoriteProduct() {
        Product product = getProductByProductNameFromConsole();
        User user = UserDatabase.getUser();
        user.favoriteAProduct(product);

            System.out.println(product.getName() + " successfully favorited.");
    }

    public Product getProductByProductNameFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter product name: ");
        String productName = scanner.nextLine();

        while (true) {
            Product product = getProductIfExist(productName);

            if (product != null) {
                return product;
            }

            System.out.println("product name is invalid");
            printAllProducts();
            System.out.println("please enter product name: ");
            productName = scanner.nextLine();
        }
    }

    private void printProducts(ArrayList<Product> products) {
        for (Product product : products) {
            product.print();
        }

        System.out.println();
    }

    private Product getProductIfExist(String productName) {
        ArrayList<Product> products = ProductDatabase.getProducts();

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }

        return null;
    }
}
