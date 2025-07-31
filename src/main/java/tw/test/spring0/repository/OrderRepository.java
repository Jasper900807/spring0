package tw.test.spring0.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.test.spring0.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByOrderId(Long orderId);

    List<Order> findByCustomerId(String customerId);

    List<Order> findByOrderDateBetween(LocalDate startDate, LocalDate endDate);

    
}
