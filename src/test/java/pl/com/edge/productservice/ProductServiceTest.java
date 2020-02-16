
package pl.com.edge.productservice;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.model.Type;
import pl.com.edge.productservice.repositories.ProductRepository;
import pl.com.edge.productservice.services.PriceCalculatorService;
import pl.com.edge.productservice.services.ProductCounterService;


public class ProductServiceTest {

    private ProductRepository productRepository = Mockito.mock(ProductRepository.class);

    @Test
    public void testShouldReturnTrueToCounterAndExceptedCounter() {
        //given
        Product product = new Product("Stolik", "Nowy", Type.MALE, 500.0);
        productRepository.save(product);
        ProductCounterService productCounterService = new ProductCounterService(productRepository);
        //when
        productCounterService.setCounterProduct(product);

        int exceptedCounter = 1;
        //then
        Assert.assertEquals(exceptedCounter, product.getCounter().getNumberOfCounter());


    } @Test
    public void testShouldReturnTrueToCounterAndExceptedCounter5() {
        //given
        Product product = new Product("Stolik", "Nowy", Type.MALE, 500.0);
        productRepository.save(product);
        ProductCounterService productCounterService = new ProductCounterService(productRepository);
        //when
        productCounterService.setCounterProduct(product);
        productCounterService.setCounterProduct(product);
        productCounterService.setCounterProduct(product);
        productCounterService.setCounterProduct(product);
        productCounterService.setCounterProduct(product);

        int exceptedCounter = 5;
        //then
        Assert.assertEquals(exceptedCounter, product.getCounter().getNumberOfCounter());


    }@Test
    public void testShouldReturnTrueToCounterAndExceptedCounter50() {
        //given
        Product product = new Product("Stolik", "Nowy", Type.MALE, 500.0);
        productRepository.save(product);
        ProductCounterService productCounterService = new ProductCounterService(productRepository);
        //when
        for (int i = 0; i<50; i++){
            productCounterService.setCounterProduct(product);
        }

        int exceptedCounter = 50;
        //then
        Assert.assertEquals(exceptedCounter, product.getCounter().getNumberOfCounter());


    }

    @Test
    public void testShouldReturnFalseBecauseExceptedCounterIsWrong() {
        //given
        Product product = new Product("Stolik", "Nowy", Type.MALE, 500.0);
        productRepository.save(product);
        ProductCounterService productCounterService = new ProductCounterService(productRepository);
        //when
        productCounterService.setCounterProduct(product);

        int exceptedCounter = 5;
        //then
        Assert.assertNotEquals(exceptedCounter, product.getCounter().getNumberOfCounter());


    }

    @Test
    public void testShouldReturnPriceAfter5PercentDiscount() {
        //given
        Product product = new Product("Wazon", "Stary", Type.FEMALE, 2500.0);
        productRepository.save(product);
        PriceCalculatorService priceCalculatorService = new PriceCalculatorService();
        //when
        priceCalculatorService.calculatePrice(product);

        Double exceptedPrice = 2500.0 * 0.95;
        //then
        Assert.assertEquals(exceptedPrice, product.getDiscountPrice());
    }

    @Test
    public void testShouldReturnWrongPriceAfter5PercentDiscount() {
        //given
        Product product = new Product("Wazon", "Stary", Type.FEMALE, 2500.0);
        productRepository.save(product);
        PriceCalculatorService priceCalculatorService = new PriceCalculatorService();
        //when
        priceCalculatorService.calculatePrice(product);

        Double exceptedPrice = 2500.0;
        //then
        Assert.assertNotEquals(exceptedPrice, product.getDiscountPrice());
    }


    @Test
    public void testShouldReturnPriceAfter3PercentDiscount() {
        //given
        Product product = new Product("Wazon", "Stary", Type.FEMALE, 1500.0);
        productRepository.save(product);
        PriceCalculatorService priceCalculatorService = new PriceCalculatorService();
        //when
        priceCalculatorService.calculatePrice(product);

        Double exceptedPrice = 1500.0 * 0.97;
        //then
        Assert.assertEquals(exceptedPrice, product.getDiscountPrice());
    }


    @Test
    public void testShouldReturnWrongPriceAfter3PercentDiscount() {
        //given
        Product product = new Product("Wazon", "Stary", Type.FEMALE, 1500.0);
        productRepository.save(product);
        PriceCalculatorService priceCalculatorService = new PriceCalculatorService();
        //when
        priceCalculatorService.calculatePrice(product);

        Double exceptedPrice = 1500.0;
        //then
        Assert.assertNotEquals(exceptedPrice, product.getDiscountPrice());
    }


}


