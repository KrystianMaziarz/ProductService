package pl.com.edge.productservice.controllers.DTOS;


import lombok.Data;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.model.Type;

@Data
public class ProductDTO  {

    private String name;
    private String description;
    private Type type;
    private Double price;
    private Double discountPrice;
    private int counter;


    public ProductDTO (Product product) {
    this.name = product.getName();
    this.description = product.getDescription();
    this.type = product.getType();
    this.price = product.getPrice();
    this.discountPrice = product.getDiscountPrice();
    this.counter = product.getCounter();
    }


}
