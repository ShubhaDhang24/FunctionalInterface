package org.example;

import org.example.Interface.Action;
import org.example.Interface.Conditional;
import org.example.Product;

import java.util.ArrayList;
import java.util.List;

import static org.example.Product.*;

public class Main {
    static Product p;

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Mobile", 2000, 10));
        productList.add(new Product("TV", 3500, 6));
        productList.add(new Product("MicroOven", 1500, 0));
        productList.add(new Product("Modem", 500, 0));
        productList.add(new Product("USB", 400, 15));
        productList.add(new Product("BATTERY", 1000, 1));


        //Print all products that have stock value of 0
        applyConditionalAndAction(productList, p1 -> p1.getStock() == 0, p1 ->
                System.out.println(p1)
        );
        System.out.println("___________________________________________________________");
        // Scenario 2: Print out the productName of all the Products that start with B.
        applyConditionalAndAction(productList, p -> p.getProductName().startsWith("B"), p -> System.out.println("Product with START LETTER  B  : " + p.getProductName()));

        System.out.println("___________________________________________________________");
        // Scenario 3: Print out all Products that have price above 1000 AND lower than 5000.
        applyConditionalAndAction(productList, p -> p.getPrice() > 1000 && p.getPrice() < 5000, p -> System.out.println("Products : " + p));

        System.out.println("____________________________________________________________________");
        // Scenario 4: Increase the price of all Products that have stock value between 1 and 20 by 50%.
        applyConditionalAndAction(productList, p -> p.getStock() > 1 && p.getStock() < 20,
                p -> System.out.println((p.getProductName() + " : " + (p.getPrice() + 1000))));

    }

}