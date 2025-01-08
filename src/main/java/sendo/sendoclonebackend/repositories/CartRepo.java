package sendo.sendoclonebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sendo.sendoclonebackend.entities.Address;

@Repository
public interface AddressRepo extends JpaRepository<Integer, Address> {
}
