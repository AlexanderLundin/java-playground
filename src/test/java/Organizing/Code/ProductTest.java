package Organizing.Code;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    Product product;
    Product.Currency currency;
    @Before
    public void Setup() {
        //Setup

    }

    @Test
    public void Test1Product() {
        product = new Product("product1", 831);
        currency = new Product.Currency(product);
        //Exercise
        String USD = currency.getUSD();
        String expected = "$8.31";
        //Assert
        assertEquals(USD, expected);
        //Teardown
    }

    @Test
    public void Test2Product() {
        product = new Product("product1", 100);
        currency = new Product.Currency(product);
        //Exercise
        String USD = currency.getUSD();
        String expected = "$1.00";
        //Assert
        assertEquals(USD, expected);
        //Teardown
    }

    @Test
    public void Test3Product() {
        product = new Product("product1", 150);
        currency = new Product.Currency(product);
        //Exercise
        String USD = currency.getUSD();
        String expected = "$1.50";
        //Assert
        assertEquals(USD, expected);
        //Teardown
    }
}