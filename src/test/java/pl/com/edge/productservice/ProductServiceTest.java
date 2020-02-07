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
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    private ProductService productService;

    @Before
    public void setUp() throws Exception {
        productService = new ProductService(productRepository);
    }

    @Test
    public void testShouldFindProductByName() {
        //given
        Product excpected = new Product("Stolik", "Opis", Type.MALE,5.0);
        List<Product> products = new ArrayList<>();
        products.add(excpected);
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        //when
        Product result = productService.findProductByName("stolik");
        //then
        Assert.assertEquals(excpected,result);

    }

    @Test
    public void testShouldFindProductByNameButExpectedIsWrong() {
        //given
        Product excpected = new Product("Stolik", "opis", Type.MALE,5.0);
        List<Product> products = new ArrayList<>();
        products.add(excpected);
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        //when
        Product result = productService.findProductByName("drzewo");
        //then
        Assert.assertNotEquals(excpected,result);

    }
    @Test
    public void testShouldFindProductByNameButPriceIsNull() {
        //given
        Product excpected = new Product("Stolik", "Opis", Type.MALE, null);
        List<Product> products = new ArrayList<>();
        products.add(excpected);
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        //when
        Double result = productService.findProductByName("stolik").getDiscountPrice();
        //then
        Assert.assertEquals(excpected.getDiscountPrice(),result);

    }

    @Test
    public void testShouldFindAllProducts() {
        //given
        Product product1 = new Product("Stolik", "Opis", Type.MALE, 125.0);
        Product product2 = new Product("Kanapka", "Opis123", Type.FEMALE, 345.0);
        Product product3 = new Product("Drzewo", "Opis3456", Type.KID, null);
        List <Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        //when
        List<Product> resultList = productService.findAll();

        //then
        Assert.assertEquals(resultList.get(0), product1);
        Assert.assertEquals(resultList.get(1), product2);
        Assert.assertEquals(resultList.get(2), product3);


    }
    @Test
    public void testShouldFindAllProductsButExpectedIsWrong() {
        //given
        Product product1 = new Product("Stolik", "Opis", Type.MALE, 125.0);
        Product product2 = new Product("Kanapka", "Opis123", Type.FEMALE, 345.0);
        Product product3 = new Product("Drzewo", "Opis3456", Type.KID, null);
        List <Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        Mockito.when(productRepository.getProducts()).thenReturn(products);
        //when
        List<Product> resultList = productService.findAll();

        //then
        Assert.assertNotEquals(resultList.get(0), product2);
        Assert.assertNotEquals(resultList.get(1), product3);
        Assert.assertNotEquals(resultList.get(2), product1);


    }
}