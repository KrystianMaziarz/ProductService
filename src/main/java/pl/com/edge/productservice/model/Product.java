package pl.com.edge.productservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
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
    private int counter;

    public Product(String name, String description, Type type, Double price) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
    }




}
