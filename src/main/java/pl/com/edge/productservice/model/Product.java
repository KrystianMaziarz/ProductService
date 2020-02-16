package pl.com.edge.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String description;
    private Type type;
    private Double price;
    private Double discountPrice;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Counter counter;


    public Product(String name, String description, Type type, Double price) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.counter = new Counter();

    }


}
