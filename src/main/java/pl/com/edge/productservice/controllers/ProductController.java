package pl.com.edge.productservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.com.edge.productservice.services.ProductService;
import pl.com.edge.productservice.model.Product;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public ResponseEntity <List<Product>> getAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity <Product> getOneProduct (@RequestParam String name) {
        Product productByName = productService.findProductByName(name);
        if (productByName!=null){
        return ResponseEntity.ok (productByName);
        }
       throw new NoSuchElementException("Brak Przedmiotu o Podanej Nazwie");

    }

}
