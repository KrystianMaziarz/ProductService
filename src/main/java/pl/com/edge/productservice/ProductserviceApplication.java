package pl.com.edge.productservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

        Product dress = new Product("Sukienka" , "Biała, w kwiatki", Type.FEMALE, 300.0);
        Product boots = new Product("Trapery", "Czarne, wygodne" , Type.MALE , 500.0);
        Product toy = new Product("Robot", "Smokozord", Type.KID , 250.0);
        Product sockets = new Product("Skarpetki", "W Choinki"  , Type.FEMALE, 45.0 );
        Product hammer = new Product("Młotek" , "Ciesielski" , Type.MALE , 80.0);
        Product cap = new Product ("Kaszkietówka" , "Zielona, młodzieżowa", Type.KID , 45.0);

        productRepository.getProducts().add(dress);
        productRepository.getProducts().add(boots);
        productRepository.getProducts().add(toy);
        productRepository.getProducts().add(sockets);
        productRepository.getProducts().add(hammer);
        productRepository.getProducts().add(cap);
    }
}
