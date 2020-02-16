package pl.com.edge.productservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.com.edge.productservice.DTOS.ProductDTO;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.repositories.ProductRepository;

//import static pl.com.edge.productservice.services.DiscountPrice.setPriceAfterDiscount;
import javax.persistence.Entity;
import javax.persistence.Id;

import static pl.com.edge.productservice.services.ProductCounter.setCounterProduct;


@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public ProductDTO findProductByName(String name) {

        Product productByName = productRepository.findByName(name);


        return new ProductDTO(productByName);

    }


}
/*
        for (Product product : productRepository()) {
            if (product.getName().equalsIgnoreCase(name)) {
                *//*setCounterProduct(product);*//*
                setPriceAfterDiscount(product);
                return new ProductDTO(product);
            }
        }
        return null;
    }*/



