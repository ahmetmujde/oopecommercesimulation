package element;

import java.util.ArrayList;

public class User {

    private String userName;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Product> favoriteProducts = new ArrayList<>();
    private ArrayList<CreditCard> creditCards = new ArrayList<>();

    private User() {

    }

    public static User create(String userName,
                              String name,
                              String surname,
                              String dateOfBirth,
                              String email,
                              String password,
                              String homeAddress,
                              String workAddress) {
        User user = new User();
        user.setUserName(userName);
        user.setName(name);
        user.setSurname(surname);
        user.setDateOfBirth(dateOfBirth);
        user.setEmail(email);
        user.setPassword(password);
        user.setHomeAddress(homeAddress);
        user.setWorkAddress(workAddress);
        return user;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void favoriteAProduct(Product product) {
        favoriteProducts.add(product);
    }

    public void addCreditCart(CreditCard card) {
        creditCards.add(card);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(ArrayList<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}

