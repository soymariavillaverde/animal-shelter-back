package Back_End.Zootopia_Proyect.repositories;

import Back_End.Zootopia_Proyect.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepository extends JpaRepository <Post, Long> {
}
