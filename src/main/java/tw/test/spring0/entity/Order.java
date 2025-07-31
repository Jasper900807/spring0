package tw.test.spring0.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "OrderID")
    private Long orderId;

    @Column(name = "CustomerID")
    private String customerId;

    @Column(name = "EmployeeID ")
    private Long empoloyeeId;
}
