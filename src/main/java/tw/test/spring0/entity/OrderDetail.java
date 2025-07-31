package tw.test.spring0.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    // -------------------

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "OrderID")
    private Order order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProductID")
    private Product product;
}
