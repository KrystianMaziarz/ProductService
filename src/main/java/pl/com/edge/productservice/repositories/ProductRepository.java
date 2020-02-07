package pl.com.edge.productservice.repositories;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import pl.com.edge.productservice.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@Setter
public class ProductRepository {

    private List<Product> products = new ArrayList <> ();
}
