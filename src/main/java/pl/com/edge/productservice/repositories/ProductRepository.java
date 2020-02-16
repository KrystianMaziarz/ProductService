package pl.com.edge.productservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.edge.productservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByNameIgnoreCase(String name);

}
