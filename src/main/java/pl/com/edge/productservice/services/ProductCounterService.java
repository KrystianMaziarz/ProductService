package pl.com.edge.productservice.services;

import org.springframework.stereotype.Service;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.repositories.ProductRepository;

@Service
public class ProductCounterService {

    private ProductRepository productRepository;

    public ProductCounterService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

     public Product setCounterProduct(Product product) {

        product.getCounter().addCounter();

        productRepository.save(product);

       return product;

    }
}
