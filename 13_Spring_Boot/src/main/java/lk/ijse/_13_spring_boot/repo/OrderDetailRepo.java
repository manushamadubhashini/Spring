package lk.ijse._13_spring_boot.repo;

import lk.ijse._13_spring_boot.embedded.OrderDetailPK;
import lk.ijse._13_spring_boot.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepo extends JpaRepository<OrderDetails, OrderDetailPK> {
}
