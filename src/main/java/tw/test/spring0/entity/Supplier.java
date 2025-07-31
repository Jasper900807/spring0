package tw.test.spring0.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "suppliers")
public class Supplier {
    @Id
    @Column(name = "SupplierID")
    private Long supplierId;

    @Column(name = "CompanyName ")
    private String companyName;

    @Column(name = "ContactName")
    private String contactName;
}
