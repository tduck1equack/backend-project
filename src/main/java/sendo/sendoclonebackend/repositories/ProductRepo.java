package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Integer, Payment> {
}
