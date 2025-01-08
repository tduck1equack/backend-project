package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.ProductSku;

@Repository
public interface ProductSkuRepo extends JpaRepository<Integer, ProductSku> {
}
