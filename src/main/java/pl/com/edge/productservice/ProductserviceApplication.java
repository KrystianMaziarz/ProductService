package pl.com.edge.productservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.com.edge.productservice.model.Counter;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.model.Type;
import pl.com.edge.productservice.repositories.ProductRepository;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {

    private ProductRepository productRepository;

    public ProductserviceApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(ProductserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {



        Product dress = new Product("Sukienka" , "Biała, w kwiatki", Type.FEMALE, 5555.0);
        Product boots = new Product("Trapery", "Czarne, wygodne" , Type.MALE , 400.0);
        Product toy = new Product("Robot", "Smokozord", Type.KID , 1500.0);


        productRepository.save(dress);
        productRepository.save(boots);
        productRepository.save(toy);

    }
}
