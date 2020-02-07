package pl.com.edge.productservice;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }



    public Product findProductByName(String name) {

        for (Product product : repository.getProducts()) {
            if (product.getName().equalsIgnoreCase(name))
               setPriceAfterDiscount(product);
            product.setCounter(product.getCounter() + 1);
            return product;
        }
        return null;
    }
    public List<Product> findAll() {
        List<Product> products = repository.getProducts();
        for (Product product : products){
            setPriceAfterDiscount(product);

        }
        return products;
    }
    private void setPriceAfterDiscount (Product product) {

        if (product.getType().equals(Type.FEMALE) || product.getType().equals(Type.MALE)) {
            product.setDiscountPrice(product.getPrice() * 0.95);
        }
        if (product.getType().equals(Type.KID)) {
            product.setDiscountPrice(product.getPrice() * 0.90);
        }

    }
}
