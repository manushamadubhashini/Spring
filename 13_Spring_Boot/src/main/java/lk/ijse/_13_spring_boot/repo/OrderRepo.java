package lk.ijse._13_spring_boot.repo;

import lk.ijse._13_spring_boot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
