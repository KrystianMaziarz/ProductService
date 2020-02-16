package pl.com.edge.productservice.mapper;

import pl.com.edge.productservice.DTOS.ProductDTO;
import pl.com.edge.productservice.model.Product;


public class ProductMapper {

    public static ProductDTO mapProductToProductDTO(Product product) {


        ProductDTO productDTO = new ProductDTO();
        productDTO.setDescription(product.getDescription());
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setType(product.getType());
        productDTO.setCounter(product.getCounter().getNumberOfCounter());
        productDTO.setDiscountPrice(product.getDiscountPrice());


        return productDTO;
    }
}
