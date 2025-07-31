package tw.test.spring0.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "ProductID")
    private Long productId;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "SupplierID")
    private Long supplierId;

    @Column(name = "CategoryID")
    private Long categoryId;

}
