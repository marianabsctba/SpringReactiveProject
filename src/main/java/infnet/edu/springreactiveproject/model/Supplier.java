package infnet.edu.springreactiveproject.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@Table("supplier")
public class Supplier {

    // Getters and Setters
    @Id
    private Integer id;
    private String name;
    private String address;

    public Supplier() {}

    public Supplier(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

}
