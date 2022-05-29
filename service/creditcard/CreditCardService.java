package service.creditcard;

import database.UserDatabase;
import element.CreditCard;
import element.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardService {

    public CreditCard getCreditCardByCreditCardNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter credit card number: ");
        String creditCardNumber = scanner.nextLine();

        while (true) {
            CreditCard creditCard = getUserCreditCardIfExist(creditCardNumber);

            if (creditCard != null) {
                return creditCard;
            }

            System.out.println("credit card number is invalid");
            printAllCreditCards();
            System.out.println("please enter credit card number: ");
            creditCardNumber = scanner.nextLine();
        }
    }

    public void printAllCreditCards() {
        ArrayList<CreditCard> creditCards = UserDatabase.getUser().getCreditCards();

        for (CreditCard creditCard : creditCards) {
            creditCard.print();
        }
    }

    public CreditCard generateCreditCardForCurrentUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Credit Card Number");
        String number = scanner.nextLine();

        System.out.println("Expiration Date");
        String expirationDate = scanner.next();

        System.out.println("Security Code");
        int securityCode = scanner.nextInt();

        User owner = UserDatabase.getUser();

        System.out.println("Credit Card successfully create");

        return CreditCard.create(number, owner, securityCode, expirationDate);
    }

    private CreditCard getUserCreditCardIfExist(String creditCardNumber) {
        ArrayList<CreditCard> creditCards = UserDatabase.getUser().getCreditCards();

        for (CreditCard creditCard : creditCards) {
            if (creditCard.getNumber().equalsIgnoreCase(creditCardNumber)) {
                return creditCard;
            }
        }

        return null;
    }
}
