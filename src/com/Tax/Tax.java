package com.Tax;

public class Tax {
    private final double FAIR_TAX_RATE = 23.00;
    private double totalPrice;
    public double calculateTax(double price) {

       return (FAIR_TAX_RATE / 100) * price;
    }


    public double calculateTotalPrice(double price) {
        totalPrice += price;
        return totalPrice;
    }

    public void setTotalPrice(double price) {
       // this.totalPrice = totalPrice;
        calculateTotalPrice(price);

    }

    public double getTotalPrice() {
        return totalPrice;
    }
}