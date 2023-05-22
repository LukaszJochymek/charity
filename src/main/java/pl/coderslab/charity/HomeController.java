package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    InstitutionRepository institutionRepository;
    DonationRepository donationRepository;

    public HomeController(InstitutionRepository institutionRepository, DonationRepository donationRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institution" , institutionRepository.findAll() );
        model.addAttribute("quantity", donationRepository.getTotalQuantity());
        model.addAttribute("sumDonation", donationRepository.getTotalDonation());
        return "index";
    }
}
