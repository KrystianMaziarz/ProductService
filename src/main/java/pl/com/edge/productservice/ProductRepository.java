package pl.com.edge.productservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@Setter
public class ProductRepository {

    private List<Product> products = new ArrayList <> ();
}
