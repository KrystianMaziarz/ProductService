package pl.com.edge.productservice.DTOS;


import lombok.Data;

import lombok.NoArgsConstructor;
import pl.com.edge.productservice.model.Type;

@Data
@NoArgsConstructor
public class ProductDTO  {

    private Long id;
    private String name;
    private String description;
    private Type type;
    private Double price;
    private Double discountPrice;
    private int counter;

    public ProductDTO(Long id, String name, String description, Type type, Double price, Double discountPrice, int counter) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.discountPrice = discountPrice;
        this.counter = counter;
    }
}
