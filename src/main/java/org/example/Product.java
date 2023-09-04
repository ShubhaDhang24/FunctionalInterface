package org.example;

import org.example.Interface.Action;
import org.example.Interface.Conditional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.Locale.filter;


public class Product {
    private String productName;
    private int stock;
    private int price;



    //getters and setters
    public String getProductName() {
        return productName;
    }

    public Product(String productName,int price,int stock) {
        this.productName = productName;
        this.price=price;
        this.stock=stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
    public static void applyConditionalAndAction(List<Product> productList, Conditional conditional,Action action)
    {
        for (Product p:productList) {
            if(conditional.test(p)){
                action.execute(p);
            }

        }
    };






}
