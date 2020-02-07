package pl.com.edge.productservice;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Product {

    private String name;
    private String description;
    private Type type;
    private Double price;
    private Double discountPrice;
    private int counter;

    public Product(String name, String description, Type type, Double price) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
    }


}
