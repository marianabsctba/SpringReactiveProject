package infnet.edu.springreactiveproject.service;

import infnet.edu.springreactiveproject.model.Product;
import infnet.edu.springreactiveproject.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import infnet.edu.springreactiveproject.model.Product;
import infnet.edu.springreactiveproject.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Mono<Product> createProduct(Product product) {
        return productRepository.save(product);
    }

    public Mono<Product> updateProduct(Integer id, Product updatedProduct) {
        return productRepository.findById(id)
                .flatMap(product -> {
                    product.setName(updatedProduct.getName());
                    product.setPrice(updatedProduct.getPrice());
                    return productRepository.save(product);
                });
    }

    public Mono<Void> deleteProduct(Integer id) {
        return productRepository.deleteById(id);
    }

    public Flux<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
