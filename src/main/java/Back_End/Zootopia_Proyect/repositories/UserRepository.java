package Back_End.Zootopia_Proyect.repositories;

import Back_End.Zootopia_Proyect.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);
}

