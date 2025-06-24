package tms.services;

public class SavingServiceImpl implements SavingService{
    @Override
    public void saveOrder(Order order) {
        System.out.println("Your order has been saved to database");
    }
}
