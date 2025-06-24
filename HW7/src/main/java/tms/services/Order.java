package tms.services;

public class Order {
    private String details;
    private String customerName;
    private String deliveryAddress;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Order(String details, String customerName, String deliveryAddress) {
        this.details = details;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
    }
}
