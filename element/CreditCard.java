package element;

public class CreditCard {

    private String number;
    private User owner;
    private int securityCode;
    private String expirationDate;

    private CreditCard() {

    }

    public static CreditCard create(String number, User owner, int securityCode, String expirationDate) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(number);
        creditCard.setOwner(owner);
        creditCard.setSecurityCode(securityCode);
        creditCard.setExpirationDate(expirationDate);
        return creditCard;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void print() {
        String print = "Credit Card Number : " + number +
                "\tSecurity Code : " + securityCode +
                "\tExpiration Date : " + expirationDate;
        System.out.println(print);
    }
}
