package tw.test.spring0.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orderdetails")
@IdClass(OrderDetailPK.class)
public class OrderDetail {
    @Id
    @Column(name = "OrderID ")
    private Long orderId;

    @Id
    @Column(name = "ProductID")
    private Long productId;

    @Column(name = "UnitPrice")
    private  BigDecimal price;

    @Column(name = "Quantity")
    private int qty;
}
