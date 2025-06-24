package tms.services;

public class Main {
    public static void main(String[] args) {
        ReceiveService onlineReceive = new OnlineReceiveImpl();
        ReceiveService phoneReceive = new PhoneReceiveImpl();
        SavingService savingService = new SavingServiceImpl();
        CookingService cookingService = new CookingServiceImpl();
        DeliveryService homeDelivery = new HomeDeliveryImpl();
        DeliveryService pickupDelivery = new PickUpDeliveryImpl();


        Order onlineOrder = new Order("Burger, Fries, Coke", "John", "12 molodeznaya ul.");
        Order phoneOrder = new Order("Pizza, Salad", "Jane", null);


        OrderService onlineOrderService = new OrderServiceImpl(
                onlineReceive, savingService, cookingService, homeDelivery);
        onlineOrderService.processOrder(onlineOrder);


        OrderService phoneOrderService = new OrderServiceImpl(
                phoneReceive, savingService, cookingService, pickupDelivery);
        phoneOrderService.processOrder(phoneOrder);
    }
}




