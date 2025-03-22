package main.java.org.ujjwal.Basics.OOPS;

public class UPI implements PaymentMethod{

    private String upiId;
    private String userName;

    public UPI(String upiId, String userName){
        this.upiId = upiId;
        this.userName = userName;
    }

    public void pay(){
        System.out.println("Making payment using UPI id "+ upiId);
    }
}
