package pl.com.edge.productservice.services;

import org.springframework.stereotype.Service;
import pl.com.edge.productservice.DTOS.ProductDTO;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.repositories.ProductRepository;

import static pl.com.edge.productservice.services.DiscountPrice.setPriceAfterDiscount;
import static pl.com.edge.productservice.services.ProductCounter.setCounterProduct;


@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public ProductDTO findProductByName(String name) {

        for (Product product : productRepository.getProducts()) {
            if (product.getName().equalsIgnoreCase(name)) {
                setCounterProduct(product);
                setPriceAfterDiscount(product);
                return new ProductDTO(product);
            }
        }
        return null;
    }

}
