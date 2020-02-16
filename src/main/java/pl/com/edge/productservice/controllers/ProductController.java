package pl.com.edge.productservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.com.edge.productservice.DTOS.ProductDTO;
import pl.com.edge.productservice.services.ProductService;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/one")
    public ResponseEntity<ProductDTO> getOneProduct(@RequestParam String name) {
        ProductDTO productByName = productService.findProductByName(name);
        if (productByName != null) {
            return ResponseEntity.ok(productByName);
        }
        throw new NoSuchElementException("Brak Przedmiotu o podanej nazwie");

    }


}
