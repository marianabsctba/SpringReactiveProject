package infnet.edu.springreactiveproject.repository;

import infnet.edu.springreactiveproject.model.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends R2dbcRepository<Product, Integer> {
    Flux<Product> findByName(String name);
}
