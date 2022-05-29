package service.order;

import database.UserDatabase;
import element.CreditCard;
import element.Order;
import element.Product;
import element.User;
import service.creditcard.CreditCardService;
import service.product.ProductService;

import java.util.ArrayList;

public class OrderService {

    private final ProductService productService;
    private final CreditCardService creditCardService;

    public OrderService(ProductService productService, CreditCardService creditCardService) {
        this.productService = productService;
        this.creditCardService = creditCardService;
    }

    public void printMyOrders() {
        User user = UserDatabase.getUser();

        ArrayList<Order> orders = user.getOrders();

        for (Order order : orders) {
            order.print();
        }
    }

    public void createOrder() {
        Product product = productService.getProductByProductNameFromConsole();
        CreditCard creditCard =  creditCardService.getCreditCardByCreditCardNumberFromConsole();

        if (!product.isStockAvailableForOrder()) {
            System.out.println(product.getName() + " stock is not proper for order.");
            return;
        }

        product.decreaseStock();
        User buyer = UserDatabase.getUser();
        Order order = Order.create(buyer, product, creditCard);
        buyer.addOrder(order);

        System.out.println("You have successfully purchased " + product.getName());
    }
}
