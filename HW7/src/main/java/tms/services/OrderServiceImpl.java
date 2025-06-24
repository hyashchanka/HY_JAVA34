package tms.services;

public class OrderServiceImpl implements OrderService{
    private ReceiveService receiveService;
    private SavingService savingService;
    private CookingService cookingService;
    private DeliveryService deliveryService;

    public OrderServiceImpl(ReceiveService receiveService, SavingService savingService, CookingService cookingService, DeliveryService deliveryService) {
        this.receiveService = receiveService;
        this.savingService = savingService;
        this.cookingService = cookingService;
        this.deliveryService = deliveryService;
    }

    @Override
    public void processOrder(Order order) {
        receiveService.receiveOrder(order);
        savingService.saveOrder(order);
        cookingService.cookingInfo(order);
        deliveryService.deliverOrder(order);
        System.out.println("See you next time!");


    }
}
