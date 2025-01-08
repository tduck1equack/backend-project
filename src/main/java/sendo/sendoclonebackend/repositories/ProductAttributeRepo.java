package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Integer, Product> {
}
