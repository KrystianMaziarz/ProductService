package pl.com.edge.productservice.services;

import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.repositories.ProductRepository;

public class ProductCounterService {

    private ProductRepository productRepository;

    public ProductCounterService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

     public static void setCounterProduct(Product product) {

       

    }
}
