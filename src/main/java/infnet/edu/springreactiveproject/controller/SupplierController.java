package infnet.edu.springreactiveproject.controller;

import infnet.edu.springreactiveproject.model.Supplier;
import infnet.edu.springreactiveproject.service.SupplierService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping
    public Mono<Supplier> createSupplier(@RequestBody Supplier supplier) {
        return supplierService.createSupplier(supplier);
    }

    @PutMapping("/{id}")
    public Mono<Supplier> updateSupplier(@PathVariable Long id, @RequestBody Supplier supplier) {
        return supplierService.updateSupplier(id, supplier);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteSupplier(@PathVariable Long id) {
        return supplierService.deleteSupplier(id);
    }

    @GetMapping("/{id}")
    public Mono<Supplier> getSupplierById(@PathVariable Long id) {
        return supplierService.findAllSuppliers()
                .filter(supplier -> supplier.getId().equals(id))
                .next();  // Assumindo que IDs são únicos, então pegamos o primeiro resultado
    }

    @GetMapping
    public Flux<Supplier> getAllSuppliers() {
        return supplierService.findAllSuppliers();
    }
}
