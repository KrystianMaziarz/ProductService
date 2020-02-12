package pl.com.edge.productservice.services;

import pl.com.edge.productservice.model.Product;

public class ProductCounter {

    public static void setCounterProduct(Product product) {

        product.setCounter(product.getCounter() + 1);

    }
}
