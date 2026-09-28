package pl.grzywacz.octocat_supply_api.product.application;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.grzywacz.octocat_supply_api.product.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private final Map<Long, Product> productsDB = new HashMap<>();

    @PostConstruct
    public void init() {
        Product product1 = new Product(1L, "Laptop", new BigDecimal("3999.99"));
        Product product2 = new Product(2L, "Monitor", new BigDecimal("499.99"));
        Product product3 = new Product(3L, "Mouse", new BigDecimal("29.99"));
        productsDB.put(product1.id(), product1);
        productsDB.put(product2.id(), product2);
        productsDB.put(product3.id(), product3);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(productsDB.values());
    }

    public Product getProductById(Long productId) {
        return productsDB.get(productId);
    }

}
