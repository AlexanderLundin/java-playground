package Classes;

import java.time.LocalDateTime;

class Order {
    private String orderNumber;
    private String name;
    private LocalDateTime createdDate;

    //your code goes here, do not change any existing code
    public Order(String orderNumber, String orderName) {
        this.orderNumber = orderNumber;
        this.name = orderName;
        this.createdDate = LocalDateTime.now();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}