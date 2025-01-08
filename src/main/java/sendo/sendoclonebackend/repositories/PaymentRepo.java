package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.OrderItem;

@Repository
public interface OrderItemRepo extends JpaRepository<Integer, OrderItem> {
}
