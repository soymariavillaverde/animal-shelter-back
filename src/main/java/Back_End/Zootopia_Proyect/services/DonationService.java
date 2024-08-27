package Back_End.Zootopia_Proyect.services;

import Back_End.Zootopia_Proyect.models.Donation;
import Back_End.Zootopia_Proyect.models.Post;
import Back_End.Zootopia_Proyect.repositories.IDonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DonationService {
    @Autowired
    private IDonationRepository iDonationRepository;

    public void createDonation(Donation donation) {
        iDonationRepository.save(donation);
    }

    public List<Donation> readDonation() {
        return new ArrayList<Donation>(iDonationRepository.findAll());
    }

    public Optional<Donation> readDonationId(Long id) {
        return iDonationRepository.findById(id);
    }

    public void updateDonation(Donation donation, Long id) {
        donation.setId(id);
        iDonationRepository.save(donation);
    }

    public void deleteDonation(Long id) {
        iDonationRepository.deleteById(id);
    }
}
