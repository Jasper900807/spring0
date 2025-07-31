package tw.test.spring0.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import tw.test.spring0.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByOrderId(Long orderId);

    List<Order> findByCustomerId(String customerId);

    List<Order> findByOrderDateBetween(LocalDate startDate, LocalDate endDate);

    @Query("""
            SELECT 
                o.employee.lastName,
                o.customer.companyName,
                p.productName,
                od.unitPrice,
                od.quantity
            FROM Order o
            JOIN o.orderDetails od
            JOIN od.product p
            WHERE o.orderId = :orderId
            """)
    List<Order> defaultMethod();
}
