package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.Cart;

@Repository
public interface CartRepo extends JpaRepository<Integer, Cart> {
}
