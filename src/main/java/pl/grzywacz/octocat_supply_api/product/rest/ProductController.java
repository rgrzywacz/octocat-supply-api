package pl.grzywacz.octocat_supply_api.product.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.grzywacz.octocat_supply_api.product.application.ProductService;
import pl.grzywacz.octocat_supply_api.product.domain.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{productId}")
    public Product getProductsById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }

}
