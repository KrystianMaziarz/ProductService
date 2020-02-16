package pl.com.edge.productservice.services;

import org.springframework.stereotype.Service;
import pl.com.edge.productservice.DTOS.ProductDTO;
import pl.com.edge.productservice.mapper.ProductMapper;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.repositories.ProductRepository;


@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductCounterService productCounterService;

    public ProductService(ProductRepository productRepository, ProductCounterService productCounterService) {
        this.productRepository = productRepository;
        this.productCounterService = productCounterService;
    }

    public ProductDTO findProductByName(String name) {

        Product productByName = productRepository.findByNameIgnoreCase(name);
        productCounterService.setCounterProduct(productByName);


        return ProductMapper.mapProductToProductDTO(productByName);

    }




}


