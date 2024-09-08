package infnet.edu.springreactiveproject.repository;

import infnet.edu.springreactiveproject.model.Supplier;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface SupplierRepository extends R2dbcRepository<Supplier, Integer> {
    Mono<Supplier> findByName(String name);
}
