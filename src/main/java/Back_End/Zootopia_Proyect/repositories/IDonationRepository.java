package Back_End.Zootopia_Proyect.repositories;

import Back_End.Zootopia_Proyect.models.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDonationRepository extends JpaRepository<Donation, Long> {
}
