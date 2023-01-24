package com.Tax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxTest {
    private Tax fairTaxCalculator;
    @BeforeEach
    void setUp(){
        fairTaxCalculator = new Tax();

    }
    @Test
    void testThatFairTestCanBeCalculated(){
        //given
        Product product = new Product("milo", 350.00);
        //when
        double tax = fairTaxCalculator.calculateTax(product.getPrice());
        //assert
        assertEquals(80.5,tax);

    }
    @Test
    void testThatProductsTotalPriceCanBeCalculated(){
        //given (the var keyword rep the Product type)
        fairTaxCalculator.setTotalPrice(50.00);
        //when
        double totalPrice = fairTaxCalculator.calculateTotalPrice(30.00);
        //assert
        assertEquals(80.00, totalPrice);

    }
}
