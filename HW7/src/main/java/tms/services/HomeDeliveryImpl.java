package tms.services;

public class HomeDeliveryImpl implements DeliveryService{
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Your order is on the way");
    }
}
