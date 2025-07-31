package tw.test.spring0.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    // --------------

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CustomerID")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EmployeeID")
    private Employee employee;

    @OneToMany(mappedBy="order")
    private OrderDetail orderDetail;
}
