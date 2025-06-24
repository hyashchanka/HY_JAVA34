package tms.services;

public class PhoneReceiveImpl implements ReceiveService{
    @Override
    public void receiveOrder(Order order) {
        System.out.println("Your order have been received via phone");
    }
}
