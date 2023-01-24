package com.Tax;

import com.Tax.FairTaxExceptions;
import com.Tax.Product;
import com.Tax.Tax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FairTaxExceptions {
        Scanner scanner = new Scanner(System.in);
        Tax fairTaxCalculator = new Tax();
        System.out.println("number of products: ");
        int numberOfProducts = scanner.nextInt();

        if (numberOfProducts < 1) throw
                new FairTaxExceptions("product number cannot be" + numberOfProducts);

        for (int index = 1; index <= numberOfProducts; index++) {
            System.out.printf("enter product %d 's name: ", index);
            String productName = scanner.next();

            System.out.printf("enter price of %s: ", productName);
            double productPrice = scanner.nextDouble();
            Product product = new Product(productName, productPrice);
            fairTaxCalculator.calculateTotalPrice(product.getPrice());


        }
        double grandTotal = fairTaxCalculator.getTotalPrice();
        double tax = fairTaxCalculator.calculateTax(grandTotal);
        System.out.printf("Pls Repay Us Now, pay %f now!!!", tax);

    }
}
