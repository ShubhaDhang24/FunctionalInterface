package org.example.Interface;

import org.example.Product;

@FunctionalInterface
public interface Conditional {
    boolean test(Product p);
}
