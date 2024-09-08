package infnet.edu.springreactiveproject.controller;

import infnet.edu.springreactiveproject.model.Product;
import infnet.edu.springreactiveproject.service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Mono<Product> createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Mono<Product> updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteProduct(@PathVariable Integer id) {
        return productService.deleteProduct(id);
    }

    @GetMapping
    public Flux<Product> getAllProducts() {
        return productService.findAllProducts();
    }
}
