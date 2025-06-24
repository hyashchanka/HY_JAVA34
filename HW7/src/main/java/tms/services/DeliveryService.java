package tms.services;

public interface DeliveryService {
    default void deliverOrder(Order order){
        System.out.println("Please pick your order up");
    }
}
