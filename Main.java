import database.ProductDatabase;
import element.CreditCard;
import service.creditcard.CreditCardService;
import service.order.OrderService;
import service.product.ProductService;
import service.user.UserService;

import java.util.Scanner;

public class Main {

    private final static int ADD_CREDIT_CARD_CODE = 1;
    private final static int LIST_CREDIT_CARD_CODE = 2;
    private final static int LIST_ALL_PRODUCTS = 3;
    private final static int PURCHASE_PRODUCTS = 4;
    private final static int LIST_MY_ORDERS = 5;
    private final static int FAVORITE_PRODUCT = 6;
    private final static int LIST_ALL_FAVORITE_PRODUCTS = 7;
    private final static int EXIT_CODE = 8;

    private final static UserService userService = new UserService();
    private final static CreditCardService creditCardService = new CreditCardService();
    private final static ProductService productService = new ProductService();
    private final static OrderService orderService = new OrderService(productService, creditCardService);
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createDefault();

        System.out.println("\nWelcome :)\n");

        System.out.println("Please create your user.");
        userService.createUser();

        System.out.println("Please add your credit card.");
        addCreditCard();

        while (true) {
            operations();
            int operationCode = scanner.nextInt();

            if (ADD_CREDIT_CARD_CODE == operationCode) {
                addCreditCard();
            } else if (LIST_CREDIT_CARD_CODE == operationCode) {
                listAllCreditCards();
            } else if (LIST_ALL_PRODUCTS == operationCode) {
                listAllProducts();
            } else if (PURCHASE_PRODUCTS == operationCode) {
                orderService.createOrder();
            } else if (LIST_MY_ORDERS == operationCode) {
                listMyOrders();
            } else if (FAVORITE_PRODUCT == operationCode) {
                productService.favoriteProduct();
            } else if (LIST_ALL_FAVORITE_PRODUCTS == operationCode) {
                listAllFavoriteProducts();
            } else if (EXIT_CODE == operationCode) {
                System.out.println("\nBYE :)\n");
                break;
            } else {
                System.out.println("Unknow operaiton code");
            }
        }
    }

    private static void createDefault() {
        ProductDatabase.createDefaultProducts();
    }

    private static void addCreditCard() {
        CreditCard creditCard = creditCardService.generateCreditCardForCurrentUser();
        userService.addCreditCardToUser(creditCard);
    }

    private static void listAllCreditCards() {
        printTitle("Your credit cars");
        creditCardService.printAllCreditCards();

        System.out.println();
    }

    private static void listAllProducts() {
        printTitle("All Products");
        productService.printAllProducts();
    }

    private static void listMyOrders() {
        printTitle("My Orders");
        orderService.printMyOrders();
    }

    private static void listAllFavoriteProducts() {
        printTitle("My Favorite Products");
        productService.printFavoriteProducts();
    }

    private static void operations() {
        printTitle("Operations");
        System.out.println("1- Add Credit Card");
        System.out.println("2- List All Credit Cards");
        System.out.println("3- List All Products");
        System.out.println("4- Purchase Product");
        System.out.println("5- List My Orders");
        System.out.println("6- Favorite A Product");
        System.out.println("7- List All Favorite Products");
        System.out.println("8- Exit");
        System.out.print("- Choose your operation: ");
    }

    private static void printTitle(String title) {
        System.out.println();
        System.out.printf("------------------------- %s -------------------------%n", title);
    }
}
