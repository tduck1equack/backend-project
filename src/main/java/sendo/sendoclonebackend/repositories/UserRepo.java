package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.SubCategory;

@Repository
public interface SubCategoryRepo extends JpaRepository<Integer, SubCategory> {
}
