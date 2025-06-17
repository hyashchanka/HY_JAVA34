package tms.services;

public class OnlineReceiveImpl implements ReceiveService{
    @Override
    public void receiveOrder(Order order) {
        System.out.println("Your order have been received online");
    }
}
