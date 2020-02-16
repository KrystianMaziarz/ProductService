package pl.com.edge.productservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
@NoArgsConstructor
public class Counter {


    @Id
    @GeneratedValue
    private Long id;
    private int counter = 0;

    @OneToOne
    private Product product;

    public Counter( int counter) {
        this.counter = counter;
    }

    public void addCounter() {

        ++counter;
    }

}
