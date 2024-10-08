package infnet.edu.springreactiveproject.service;

import infnet.edu.springreactiveproject.model.Supplier;
import infnet.edu.springreactiveproject.repository.SupplierRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public Mono<Supplier> createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public Mono<Supplier> updateSupplier(Integer id, Supplier updatedSupplier) {
        return supplierRepository.findById(id)
                .flatMap(supplier -> {
                    supplier.setName(updatedSupplier.getName());
                    supplier.setAddress(updatedSupplier.getAddress());
                    return supplierRepository.save(supplier);
                });
    }

    public Mono<Void> deleteSupplier(Integer id) {
        return supplierRepository.deleteById(id);
    }

    public Flux<Supplier> findAllSuppliers() {
        return supplierRepository.findAll();
    }
}


