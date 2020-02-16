package pl.com.edge.productservice.services;
import org.springframework.stereotype.Service;
import pl.com.edge.productservice.DTOS.ProductDTO;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.repositories.ProductRepository;

@Service
public class PriceCalculatorService {


    public void calculatePrice(Product product) {

        if (product.getPrice() > 500 && product.getPrice() < 2000) {
            product.setDiscountPrice(product.getPrice() * 0.90);
        }
        if (product.getPrice() >= 2000) {
            product.setDiscountPrice(product.getPrice() * 0.95);
        }
        if (product.getPrice() < 500) {
            product.setDiscountPrice(product.getPrice());
        }
    }
}
