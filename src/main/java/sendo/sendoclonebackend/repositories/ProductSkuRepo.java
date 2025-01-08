package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.ProductAttribute;

@Repository
public interface ProductAttributeRepo extends JpaRepository<Integer, ProductAttribute> {
}
