package pl.com.edge.productservice.DTOS;


import lombok.Data;
import lombok.NoArgsConstructor;
import pl.com.edge.productservice.model.Counter;
import pl.com.edge.productservice.model.Type;

@Data
@NoArgsConstructor
public class ProductDTO  {

    private Long id;
    private String name;
    private String description;
    private Type type;
    private Double price;
    private Double discountPrice;
    private Counter counter;





}
