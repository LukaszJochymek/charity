package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class DonationController {
    CategoryRepository categoryRepository;
    InstitutionRepository institutionRepository;
    DonationRepository donationRepository;

    public DonationController(CategoryRepository categoryRepository, InstitutionRepository institutionRepository, DonationRepository donationRepository) {
        this.categoryRepository = categoryRepository;
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        Donation donation = new Donation();
        model.addAttribute("donation", donation);
        model.addAttribute("category", categoryRepository.findAll());
        model.addAttribute("institution", institutionRepository.findAll() );

        return "form";
    }

    @PostMapping("/add")
    public String save(Donation donation) {
        donationRepository.save(donation);
        return "wysłane";
    }
}
