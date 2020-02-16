package pl.com.edge.productservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.model.Type;
import pl.com.edge.productservice.repositories.ProductRepository;
import pl.com.edge.productservice.services.ProductService;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    private ProductService productService;
}
   /* @Before
    public void setUp() throws Exception {
        productService = new ProductService(productRepository);
  }


*/
/*

  @Test
    public void testShouldReturnOneProductWithCounter1() {
        //given
        Product product1 = new Product("stolik", "kolor dąb sonoma", Type.MALE, 200.0);
        Product product2 = new Product("kanapa", "sprężyny faliste , 3 poduszki", Type.MALE, 300.0);
        Product product3 = new Product("telewizor", "nowy", Type.MALE, 400.0);
        ArrayList<Product> products = new ArrayList<>();
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        int exceptedCounter = 1;
        //when
        productService.findProductByName("kanapa");
        //then
        Assert.assertEquals(exceptedCounter, product2.getCounter());



    }




    @Test
    public void testShouldReturnOneProductWithCounterButExceptedCounterIsWrong() {
        //given
        Product product1 = new Product("stolik", "kolor dąb sonoma", Type.MALE, 200.0);
        Product product2 = new Product("kanapa", "sprężyny faliste , 3 poduszki", Type.MALE, 300.0);
        Product product3 = new Product("telewizor", "nowy", Type.MALE, 400.0);
        ArrayList<Product> products = new ArrayList<>();
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        int exceptedCounter = 5;
        //when
        productService.findProductByName("kanapa");
        //then
        Assert.assertNotEquals(exceptedCounter, product2.getCounter());



    }





    @Test
    public void testShouldReturnOneProductWithPriceAfterDiscount() {
        //given
        Product product1 = new Product("stolik", "kolor dąb sonoma", Type.MALE, 200.0);
        Product product2 = new Product("kanapa", "sprężyny faliste , 3 poduszki", Type.MALE, 300.0);
        Product product3 = new Product("telewizor", "nowy", Type.MALE, 400.0);
        ArrayList<Product> products = new ArrayList<>();
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        Double exceptedPriceAfterDiscount = product2.getPrice() * 0.95;
        //when
        productService.findProductByName("kanapa");
        //then
        Assert.assertEquals(exceptedPriceAfterDiscount, product2.getDiscountPrice());


    }





    @Test
    public void testShouldReturnOneProductWithPriceAfterDiscountButExceptedPriceAfterDiscountIsWrong() {
        //given
        Product product1 = new Product("stolik", "kolor dąb sonoma", Type.MALE, 200.0);
        Product product2 = new Product("kanapa", "sprężyny faliste , 3 poduszki", Type.MALE, 300.0);
        Product product3 = new Product("telewizor", "nowy", Type.MALE, 400.0);
        ArrayList<Product> products = new ArrayList<>();
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        Double exceptedPriceAfterDiscount = product2.getPrice() * 0.50;
        //when
        productService.findProductByName("kanapa");
        //then
        Assert.assertNotEquals(exceptedPriceAfterDiscount, product2.getDiscountPrice());


    }


}

*/

