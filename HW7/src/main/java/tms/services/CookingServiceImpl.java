package tms.services;

public class CookingServiceImpl implements CookingService{
    @Override
    public void cookingInfo(Order order) {
        System.out.println("Your order is cooking");
    }
}
