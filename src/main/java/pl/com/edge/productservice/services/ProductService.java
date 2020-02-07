package pl.com.edge.productservice.services;

import org.springframework.stereotype.Service;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.model.Type;
import pl.com.edge.productservice.repositories.ProductRepository;

import java.util.List;


@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }



    public Product findProductByName(String name) {

        for (Product product : productRepository.getProducts()) {
            if (product.getName().equalsIgnoreCase(name)) {
               setPriceAfterDiscount(product);
            product.setCounter(product.getCounter() + 1);
            return product; }
        }
        return null;
    }
    public List<Product> findAll() {
        List<Product> products = productRepository.getProducts();
        for (Product product : products){
            setPriceAfterDiscount(product);

        }
        return products;
    }
    private void setPriceAfterDiscount (Product product) {

        if (product.getType().equals(Type.FEMALE) || product.getType().equals(Type.MALE)) {
            if (product.getPrice()!= null) {
                product.setDiscountPrice(product.getPrice() * 0.95);
            }
        }
        if (product.getType().equals(Type.KID)) {
            if (product.getPrice() != null) {
                product.setDiscountPrice(product.getPrice() * 0.90);
            }
        }

    }
}
