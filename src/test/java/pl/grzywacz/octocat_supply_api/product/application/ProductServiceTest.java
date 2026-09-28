package pl.grzywacz.octocat_supply_api.product.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.grzywacz.octocat_supply_api.product.domain.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    void getProducts_shouldReturnExpectedProducts() {
        List<Product> products = productService.getProducts();
        assertEquals(3,products.size());
    }
}