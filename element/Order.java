package element;

public class Order {

    private User buyer;
    private Product product;
    private CreditCard creditCard;

    private Order() {

    }

    public static Order create(User buyer, Product product, CreditCard creditCard) {
        Order order = new Order();
        order.setBuyer(buyer);
        order.setProduct(product);
        order.setCreditCard(creditCard);
        return order;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void print() {
        String print = "Product Name : " + product.getName() +
                "\tCredit Card Number : " + creditCard.getNumber();
        System.out.println(print);
    }
}
