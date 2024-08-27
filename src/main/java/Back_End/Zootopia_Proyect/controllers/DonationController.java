package Back_End.Zootopia_Proyect.controllers;

import Back_End.Zootopia_Proyect.models.Donation;
import Back_End.Zootopia_Proyect.models.Post;
import Back_End.Zootopia_Proyect.services.DonationService;
import Back_End.Zootopia_Proyect.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/donations")
public class DonationController {

    @Autowired
    DonationService donationService;

    @GetMapping(path = "/getAll")
    public List<Donation> getAllDonation() {
        return donationService.readDonation();
    }

    @PostMapping(path = "/newDonation")
    public void createDonation(@RequestBody Donation donation) {
        donationService.createDonation(donation);
    }

    @PutMapping(path = "/update/{id}")
    public void updateDonation(@RequestBody Donation donation, @PathVariable Long id) {
        donationService.updateDonation(donation, id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteDonation(@PathVariable Long id) {
        donationService.deleteDonation(id);
    }
}
