package projects.P02_javaBankATM.JavaBankATM01;

public class Customer {
    private String cardNumber;
    private String cardPassword;
    private double accountBalance;


    // getter and setter methods..
    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    // constractors
    public Customer() {

    }
    public Customer(String cardNumber, String cardPassword, double accountBalance) {
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.accountBalance = accountBalance;
    }
}
