package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Integer, Category> {
}
