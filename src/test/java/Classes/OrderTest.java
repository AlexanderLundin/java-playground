package Classes;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class OrderTest {
    
//    Given the class Order below, declare a constructor that sets the order number and name. 
//    When an order is created, it should also save the creation date (hint: use LocalDateTime.now()).
    @Test
    public void TestConstructor() {
        //Setup
        LocalDateTime timeNow = LocalDateTime.now();
        String orderNumber = "1";
        String orderName = "First Order";
        //Exercise
        Order order = new Order(orderNumber, orderName);
        String actualName = order.getName();
        //Assert
        assertEquals(actualName, orderName);
        //Teardown
    }
}