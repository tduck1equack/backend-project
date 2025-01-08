package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<Integer, CartItem> {
}
