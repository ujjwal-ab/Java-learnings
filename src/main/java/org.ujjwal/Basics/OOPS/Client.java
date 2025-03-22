package main.java.org.ujjwal.Basics.OOPS;

public class Client {

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("UjjwalDebitCard", new DebitCard("1234", "Ujjwal Abhishek"));
        ps.addPaymentMethod("UjjwalCreditCard", new CreditCard("5678", "Ujjwal Abhishek"));
        ps.addPaymentMethod("UjjwalUPI", new UPI("ujjwal@upi", "Ujjwal Abhishek"));
        ps.addPaymentMethod("UjjwalWallet", new Wallet());

        ps.makePayment("UjjwalDebitCard");
    }
}
