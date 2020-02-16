package pl.com.edge.productservice.services;

import org.springframework.stereotype.Service;
import pl.com.edge.productservice.model.Product;

@Service
public class PriceCalculatorService {


    public void calculatePrice(Product product) {

        if (product.getPrice() > 500 && product.getPrice() < 2000) {
            product.setDiscountPrice(product.getPrice() * 0.97);
        }
        if (product.getPrice() >= 2000) {
            product.setDiscountPrice(product.getPrice() * 0.95);
        }
        if (product.getPrice() < 500) {
            product.setDiscountPrice(product.getPrice());
        }
    }
}
