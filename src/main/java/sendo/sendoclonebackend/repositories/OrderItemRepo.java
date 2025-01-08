package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.OrderDetail;

@Repository
public interface OrderDetailRepo extends JpaRepository<Integer, OrderDetail> {
}
