package pl.com.edge.productservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Counter {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numberOfCounter = 0;

    @OneToOne
    private Product product;

    public Counter (){

    }

    public Counter(int counter, Product product) {
        this.numberOfCounter = counter;
        this.product = product;
    }

    public void addCounter() {

        ++numberOfCounter;
    }

}
