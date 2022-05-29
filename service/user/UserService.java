package service.user;

import database.UserDatabase;
import element.CreditCard;
import element.User;

import java.util.Scanner;

public class UserService {

    public void addCreditCardToUser(CreditCard creditCard) {
        User user = UserDatabase.getUser();
        user.addCreditCart(creditCard);
    }

    public void createUser() {
        User user = generateUser();
        addUser(user);
    }

    public User generateUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username");
        String userName = scanner.nextLine();

        System.out.println("Name");
        String name = scanner.nextLine();

        System.out.println("Surname");
        String surname = scanner.nextLine();

        System.out.println("Birth Date");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Email");
        String email = scanner.nextLine();

        System.out.println("Password");
        String password = scanner.nextLine();

        System.out.println("Home Address");
        String homeAddress = scanner.nextLine();

        System.out.println("Work Address");
        String workAddress = scanner.nextLine();

        System.out.println("User successfully created");

        return User.create(userName, name, surname, dateOfBirth, email, password, homeAddress, workAddress);
    }

    public void addUser(User user) {
        UserDatabase.setUser(user);
        System.out.println("User successfully saved");
    }
}
